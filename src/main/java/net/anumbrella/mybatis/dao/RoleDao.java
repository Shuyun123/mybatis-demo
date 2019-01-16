package net.anumbrella.mybatis.dao;

import net.anumbrella.mybatis.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Anumbrella
 */
@Mapper
public interface RoleDao {

    /**
     * 根据角色ID获取角色
     *
     * @param id
     * @return
     */
    Role selectRoleById(Long id);
}
