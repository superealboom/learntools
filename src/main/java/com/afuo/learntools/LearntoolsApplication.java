package com.afuo.learntools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.afuo.learntools.mapper")
public class LearntoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearntoolsApplication.class, args);
    }

}
