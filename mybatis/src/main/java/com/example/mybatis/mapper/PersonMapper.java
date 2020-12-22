package com.example.mybatis.mapper;

import com.example.mybatis.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {

     Person getPersonById(int id);

     String insertPerson(Person person);

}
