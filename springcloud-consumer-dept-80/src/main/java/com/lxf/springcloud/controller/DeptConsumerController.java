package com.lxf.springcloud.controller;

import com.lxf.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "https://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/query/"+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> getAll(){
        return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
