package com.bank.lienviet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class LienvietApplication {

    public static void main(String[] args) {

        SpringApplication.run(LienvietApplication.class, args);
        System.out.println(System.currentTimeMillis());
    }

}
