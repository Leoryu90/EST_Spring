package com.example.basic.day2.ex2;


//@SpringBootApplication
public class BasicApplication {


    public static void main(String[] args) {

        User model = new User("max@gmail.com", "김승조", 30);
        UserView userView = new UserView();
        UserController userController = new UserController(model, userView);
        userController.updateView();
        userController.setUserName("김승조랑말");
        userController.setUserAge(31);

        userController.updateView();
    }
}
