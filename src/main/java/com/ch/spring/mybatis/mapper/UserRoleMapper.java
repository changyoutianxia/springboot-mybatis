package com.ch.spring.mybatis.mapper;

import com.ch.spring.mybatis.po.UserRole;

import java.util.List;


public interface UserRoleMapper {
    List<UserRole> findUserRoleListByUserId(String userId);
}
