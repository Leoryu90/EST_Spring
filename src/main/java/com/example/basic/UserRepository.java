package com.example.basic;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("save user");
    }

    @Override
    public void delete(User user) {
        System.out.println("delete user");
    }
}
