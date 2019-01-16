package net.anumbrella.mybatis.service.impl;

import net.anumbrella.mybatis.dao.UserDao;
import net.anumbrella.mybatis.entity.User;
import net.anumbrella.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anumbrella
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectUserAndRoleByIdSelect(Long id) {
        return userDao.selectUserAndRoleByIdSelect(id);
    }

}