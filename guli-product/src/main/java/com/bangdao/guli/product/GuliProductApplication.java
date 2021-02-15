package com.bangdao.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Chen
 * @create 2021-02-11
 */
@SpringBootApplication
@MapperScan("com.bangdao.guli.product.dao")
public class GuliProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuliProductApplication.class, args);
    }
}
