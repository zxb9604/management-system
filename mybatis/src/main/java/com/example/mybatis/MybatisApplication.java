package com.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.example.mybatis.mapper")
@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisApplication.class, args);
        System.out.println("启动成功......");
    }

}
