package com.lxf.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Hiiro
 * @date 2021/12/6
 * @description
 */
@Data
@NoArgsConstructor
//链式写法
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname){
        this.dname=dname;
    }

}
