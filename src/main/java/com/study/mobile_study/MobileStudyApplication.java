package com.study.mobile_study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.study.mobile_study.mapper"})
public class MobileStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileStudyApplication.class, args);
    }

}

