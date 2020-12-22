package com.example.mybatis.controller;

import com.example.mybatis.entity.Person;
import com.example.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonMapper personMapper;

    @GetMapping("/per/{id}")
    public Person getPersonById(@PathVariable int id){
        return personMapper.getPersonById(id);
    }
}
