package com.lxf.springcloud.mapper;

import com.lxf.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@Mapper
@Repository
public interface DeptMapper {
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
