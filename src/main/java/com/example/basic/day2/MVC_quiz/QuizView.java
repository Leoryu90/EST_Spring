package com.example.basic.day2.MVC_quiz;

public class QuizView {
    public void displayQuestion(Quiz quiz){
        System.out.println(quiz.getQuestion());
        System.out.println("당신의 답은: " + quiz.getAnswer());

    }
}
