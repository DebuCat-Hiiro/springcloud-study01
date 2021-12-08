package com.lxf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Hiiro
 * @date 2021/12/8 18:10
 */
@SpringBootApplication
//开启监控页面
@EnableHystrixDashboard
public class HystrixDeptDashboard {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDeptDashboard.class,args);
    }

}
