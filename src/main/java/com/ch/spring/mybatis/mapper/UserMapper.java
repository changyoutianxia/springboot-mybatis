package com.ch.spring.mybatis.mapper;

import com.ch.spring.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findUserByUserNameAndStatus(@Param("username") String username, @Param("status") String status);
    List<User> getAll();
}
