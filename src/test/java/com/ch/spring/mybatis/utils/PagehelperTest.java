package com.ch.spring.mybatis.utils;

import com.ch.spring.mybatis.SpringMybatisApplicationTests;
import com.ch.spring.mybatis.mapper.UserMapper;
import com.ch.spring.mybatis.po.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PagehelperTest extends SpringMybatisApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void pageHelper() {
        Page pag=PageHelper.startPage(2,2);
        List<User> userList = userMapper.getAll();
        System.out.println(userList.size());
        System.out.println(pag.getPages());
        System.out.println(pag.getPageSize());
        System.out.println(pag.getStartRow());
        System.out.println(pag.getCountColumn());
    }
}
