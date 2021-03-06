package com.example.mybatis;

import com.example.mybatis.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() {
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
