package com.ch.spring.mybatis.source;

import com.ch.spring.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperSource {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void other() {
        System.out.println(userMapper.findUserByUserNameAndStatus("zhangsan", null));
    }
}
