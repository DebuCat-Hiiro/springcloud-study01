package com.lxf.springcloud.service;

import com.lxf.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/8 13:59
 */

@FeignClient(name = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class )
public interface DeptClientService {
    @PostMapping("/dept/add")
    boolean addDept( Dept dept);

    @GetMapping("/dept/query/{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();

}
