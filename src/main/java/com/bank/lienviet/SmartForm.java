package com.bank.lienviet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartForm {

    public static void main(String[] args) {

        SpringApplication.run(SmartForm.class, args);
        System.out.println(System.currentTimeMillis());
    }

}
