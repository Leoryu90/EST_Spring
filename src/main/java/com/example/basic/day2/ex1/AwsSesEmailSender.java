package com.example.basic.day2.ex1;

public class AwsSesEmailSender implements EmailSender {

    @Override
    public void sendEmail(String to, String subject, String body) {
        // AWS SES 기술을 활용한 로직이 들어갔다.
        System.out.println("Sending AWS SES email to " + to);
    }
}
