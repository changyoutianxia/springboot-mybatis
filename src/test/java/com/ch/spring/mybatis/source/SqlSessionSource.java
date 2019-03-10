package com.ch.spring.mybatis.source;

import com.ch.spring.mybatis.SpringMybatisApplicationTests;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SqlSessionSource extends SpringMybatisApplicationTests {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Test
    public void getSqlSession() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
    }
}
