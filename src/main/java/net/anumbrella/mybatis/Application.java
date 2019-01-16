package net.anumbrella.mybatis;

import net.anumbrella.mybatis.config.DaoNameGenerator;
import net.anumbrella.mybatis.dao.UserDao;
import net.anumbrella.mybatis.entity.Role;
import net.anumbrella.mybatis.entity.User;
import net.anumbrella.mybatis.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @author anumbrella
 */
@SpringBootApplication
@MapperScan(value = {"net.anumbrella.mybatis.dao"}, nameGenerator = DaoNameGenerator.class)
public class Application implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // userDao.selectAll();
        // userDao.selectById(1l);
        // userDao.selectUserAndRoleById(2l);

        // userDao.selectUserAndRoleByIdSelect(2l);

        // List<User> data = userDao.selectAllUserAndRoles();

        // System.out.println("total size: " + data.size());

//        for (User entity : data) {
//            List<Role> roleList = entity.getRoleList();
//            System.out.println("role size: " + roleList.size());
//        }


        User data = userDao.selectAllUserAndRolesSelect(1l);

        List<Role> roleList = data.getRoleList();
        System.out.println("role size: " + roleList.size());

    }

}
