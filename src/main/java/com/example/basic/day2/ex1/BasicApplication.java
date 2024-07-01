package com.example.basic.day2.ex1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {
    public static void main(String[] args) {
        EmailService emailService = new EmailService(new SmtpEmailSender());
        EmailService emailService1 = new EmailService(new AwsSesEmailSender());

    }
}
