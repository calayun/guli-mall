package com.bangdao.guli.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bangdao.guli.order.dao")
public class GuliOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliOrderApplication.class, args);
    }

}
