package com.ch.spring.mybatis.mapper;

import com.ch.spring.mybatis.po.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface PermissionMapper {
    @Select("select id,permission from permissions where id=#{id}")
    Permission findUserPermissionById(Integer id);

    List<Permission> findUserPermissionListByUserName(String userName);

}
