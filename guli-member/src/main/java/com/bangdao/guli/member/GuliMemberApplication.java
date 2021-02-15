package com.bangdao.guli.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bangdao.guli.member.dao")
public class GuliMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMemberApplication.class, args);
    }

}
