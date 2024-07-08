package com.example.basic.day3.ex3.service;

import com.example.basic.day3.ex3.utill.Helper;
import com.example.basic.day3.ex3.utill.Test1;
import com.example.basic.day3.ex3.utill.Test2;
import com.example.basic.day3.ex3.utill.Test3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService {

    private final Helper helper;
    private final Test1 test1;
    private final Test2 test2;
    private final Test3 test3;



    public String hello() {
        System.out.println(this.helper);
        return "Hello, Spring Boot!";
    }
}
