package com.lxf.springcloud.service.impl;

import com.lxf.springcloud.mapper.DeptMapper;
import com.lxf.springcloud.pojo.Dept;
import com.lxf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryById(Long deptno) {
        return deptMapper.queryById(deptno);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
