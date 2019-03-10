package com.ch.spring.mybatis.mapper;

import com.ch.spring.mybatis.po.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface RoleMapper {
    @Select("select id,role from roles where id=#{id}")
    Role findUserRoleById(Integer id);

    List<Role> findUserRoleListByUserName(String userName);
}
