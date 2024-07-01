package com.example.basic.day2.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUser(String key){
        User user = userRepository.getUser(key);
        System.out.println("오오오오오징어");
        return user.getName();
    }
}