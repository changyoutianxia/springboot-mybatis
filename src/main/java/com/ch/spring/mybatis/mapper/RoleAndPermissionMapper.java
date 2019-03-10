package com.ch.spring.mybatis.mapper;

import com.ch.spring.mybatis.po.RolePermission;
import org.apache.ibatis.annotations.Select;


public interface RoleAndPermissionMapper {
    @Select("select id,role,permission from roles_permissions where id=#{id}")
    RolePermission findUserRolePermissionById(Integer id);
}
