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
}
