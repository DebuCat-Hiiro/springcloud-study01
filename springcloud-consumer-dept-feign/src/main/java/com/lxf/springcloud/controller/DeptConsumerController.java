package com.lxf.springcloud.controller;

import com.lxf.springcloud.pojo.Dept;
import com.lxf.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service=null;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return this.service.addDept(dept);
    }

    @GetMapping("/consumer/dept/query/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return this.service.queryById(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> getAll(){
        return  this.service.queryAll();
    }
}
