package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import com.atguigu.properties.DataSourceProperties2;
import com.atguigu.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({DataSourceProperties2.class,JdbcProperties.class})
public class HelloController {
    @Autowired
    DataSourceProperties dataSourceProperties;

    @Autowired
    DataSourceProperties2 dataSourceProperties2;

    @Autowired
    JdbcProperties jdbcProperties;

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("dataSourceProperties = " + dataSourceProperties);
        System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
        System.out.println("jdbcProperties = " + jdbcProperties);
        return "hello spring Boot!!!";
    }


}
