package com.example.basic.day6_0716;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        // 천제 사용자 목록 조회
        return null;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return null;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        //특정 사용자를 찾기
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User updateUser) {
        //업데이트 로직
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {

    }
}
