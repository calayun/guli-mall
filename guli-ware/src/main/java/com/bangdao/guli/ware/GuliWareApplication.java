package com.bangdao.guli.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bangdao.guli.ware.dao")
public class GuliWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliWareApplication.class, args);
    }

}
