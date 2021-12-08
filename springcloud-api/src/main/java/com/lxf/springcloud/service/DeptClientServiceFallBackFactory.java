package com.lxf.springcloud.service;

import com.lxf.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Hiiro
 * @date 2021/12/8 16:07
 */

@Service
public class DeptClientServiceFallBackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id-->"+id+"该系统实施降级操作，服务暂时不可用")
                        .setDb_source("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}

