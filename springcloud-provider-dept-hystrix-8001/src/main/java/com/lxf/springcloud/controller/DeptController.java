package com.lxf.springcloud.controller;

import com.lxf.springcloud.pojo.Dept;
import com.lxf.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept getDept(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw  new RuntimeException("id->"+id+",不存在");
        }
        return dept;
    }

    //备选方法
    public Dept hystrixGet(Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id->"+id+",不存在")
                .setDb_source("no database");
    }

}
