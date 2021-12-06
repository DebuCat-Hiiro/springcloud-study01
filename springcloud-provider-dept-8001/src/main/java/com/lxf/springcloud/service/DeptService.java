package com.lxf.springcloud.service;

import com.lxf.springcloud.mapper.DeptMapper;
import com.lxf.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
public interface DeptService {
    /**
     * 增加一个部门
     * @param dept
     * @return boolean
     */
    boolean addDept(Dept dept);

    /**
     * 查询一个部门
     * @param deptno
     * @return Dept
     */
    Dept queryById(Long deptno);

    /**
     * 查询所有部门
     * @param
     * @return Dept
     */
    List<Dept> queryAll();
}
