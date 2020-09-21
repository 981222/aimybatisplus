package com.huang.aimybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huang.aimybatisplus.mapper")
public class AimybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(AimybatisplusApplication.class, args);
    }

}
