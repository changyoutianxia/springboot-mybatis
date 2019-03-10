package com.ch.spring.mybatis.plugins;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.Properties;

/**
 * 拦截的四大对象
 * 拦截的方法
 * 参数类型
 * */
//@Component
@Intercepts(@Signature(type= StatementHandler.class,method = "parameterize",args = Statement.class))
public class HelloWordPlugin implements Interceptor {
    /**
     * 是否放行
     *
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        MetaObject metaObject = SystemMetaObject.forObject(target);
        //获取值
        Object value = metaObject.getValue("parameterHandler.parameterObject");
        System.out.println(value);
        //设置值
        metaObject.setValue("parameterHandler.parameterObject",value);
        Object proceed = invocation.proceed();
        return  proceed;
    }

    /**
     * 创建代理
     *
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        /**
         *用于创建代理对象
         */
        Object wrap = Plugin.wrap(target, this);
        return wrap;
    }

    /**
     * 这里的properties 可以获取到设置的变量对于该拦截器
     *
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {
        
    }
}
