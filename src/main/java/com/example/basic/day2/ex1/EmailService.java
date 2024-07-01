package com.example.basic.day2.ex1;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String to, String subject, String body) {
        emailSender.sendEmail(to, subject, body);
    }
}
