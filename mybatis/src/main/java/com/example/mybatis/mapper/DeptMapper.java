package com.example.mybatis.mapper;


import com.example.mybatis.entity.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DeptMapper {

    @Select("select * from department where id=#{id}")
    Department getDepById(int id);

    @Delete("delete from department where id=#{id}")
    int deleteDepById(int id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(name) values(#{name})")
     int insertDept(Department department);

    @Update("update department set name=#{name} where id=#{id}")
     int updateDept(Department department);
}
