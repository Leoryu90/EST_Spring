package com.example.basic;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }


}