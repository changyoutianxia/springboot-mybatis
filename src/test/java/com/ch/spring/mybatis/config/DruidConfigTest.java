package com.ch.spring.mybatis.config;

import com.ch.spring.mybatis.SpringMybatisApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class DruidConfigTest extends SpringMybatisApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void druidConfig() {
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap("select 1 as test");
        System.out.println(stringObjectMap.get("test"));
    }

}