package com.example.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(scanBasePackages = "com.example.basic")
public class BasicApplication {

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        String url = "/hello";

        new MockHttpServletRequest(url);
        new MockHttpServletResponse();
    }
}