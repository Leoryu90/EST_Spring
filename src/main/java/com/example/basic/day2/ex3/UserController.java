//package com.example.basic.day2.ex3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/user/max")
//    public String getUserResult() {
//        return userService.getUser();
//    }
//
//    @GetMapping("/user")
//    public String getUser() {
//        return "Hello";
//    }
//}
