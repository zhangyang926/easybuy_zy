package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.zy.mapper")
@SpringBootApplication
public class EasybuyZyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasybuyZyApplication.class, args);
    }

}
