package net.anumbrella.mybatis;

import net.anumbrella.mybatis.config.DaoNameGenerator;
import net.anumbrella.mybatis.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        userDao.selectById(1l);
    }

}
