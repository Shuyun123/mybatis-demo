package net.anumbrella.mybatis.controller;

import net.anumbrella.mybatis.entity.User;
import net.anumbrella.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Anumbrella
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("users/{id}")
    public User user(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping("users")
    public List<User> users() {
        return userService.findAll();
    }


    @RequestMapping("test")
    public void test() {
         userService.selectUserAndRoleByIdSelect(2l);
    }
}
