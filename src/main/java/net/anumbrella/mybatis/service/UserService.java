package net.anumbrella.mybatis.service;

import net.anumbrella.mybatis.entity.User;

import java.util.List;

/**
 * @author Anumbrella
 */
public interface UserService {

    /**
     * 通过 id 查询用户
     *
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 查询全部用户
     *
     * @return
     */
    List<User> findAll();


    /**
     * 根据用户 id 获取用户信息和用户的角色信息，嵌套查询方式
     *
     * @param id
     * @return
     */
    User selectUserAndRoleByIdSelect(Long id);
}
