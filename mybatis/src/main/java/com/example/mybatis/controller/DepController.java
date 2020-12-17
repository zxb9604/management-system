package com.example.mybatis.controller;

import com.example.mybatis.entity.Department;
import com.example.mybatis.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {

    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/dept/{id}")
    public Department getDeptMapper(@PathVariable int id) {
        return deptMapper.getDepById(id);
    }

    @GetMapping("/dept")
    public Department insertDeptMapper( Department department){
        System.out.println("准备进行插入数据操作！");
        deptMapper.insertDept(department);
        return department;
    }
}
