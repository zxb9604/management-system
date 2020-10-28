package com.modeltest.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelApplication {

    public static void main(String[] args) {

        SpringApplication.run(ModelApplication.class, args);
        System.out.println("启动成功......");
    }

}
