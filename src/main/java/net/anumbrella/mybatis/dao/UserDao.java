package net.anumbrella.mybatis.dao;

import net.anumbrella.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author Anumbrella
 */
@Mapper
public interface UserDao {
    /**
     * 查询全部数据
     *
     * @return
     */
    List<User> selectAll();


    /**
     * 通过 id 查询用户
     *
     * @param id
     * @return
     */
    User selectById(Long id);


    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int insert(User user);


    /**
     * 根据用户 id 或用户名查询
     *
     * @param user
     * @return
     */
    User selectByIdOrUserName(User user);


    /**
     * 根据动态条件查询用户信息
     *
     * @param user
     * @return
     */
    List<User> selectByUser(User user);


    /**
     * 根据用户 id 集合查询
     *
     * @param idList
     * @return
     */
    List<User> selectByIdList(List<Long> idList);


    /**
     * 通过 Map 更新列
     *
     * @param map
     * @return
     */
    int updateByMap(Map<String, Object> map);


    /**
     * 根据主键更新
     *
     * @param user
     * @return
     */
    int updateById(User user);
}