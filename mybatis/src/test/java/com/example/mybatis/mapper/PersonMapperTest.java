package com.example.mybatis.mapper;

import com.example.mybatis.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    DataSource dataSource;

    @Test
    public void getPersonById() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try (SqlSession session = sqlSessionFactory.openSession(conn)) {
            Person blog = session.selectOne("com.example.mybatis.mapper.PersonMapper.getPersonById", 2);
            System.out.println(blog);
        }

    }
}