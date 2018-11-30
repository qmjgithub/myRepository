package com.qmj.springbootstandard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStandardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStandardApplication.class, args);
        System.out.println("启动成功!");
    }
}
