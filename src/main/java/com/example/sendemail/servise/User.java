package com.example.sendemail.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class User implements UserServise{

    @Autowired
    private JavaMailSender sender;
    @Override
    public ResponseEntity<?> sendEmail(String to, String subject, String body) {
        SimpleMailMessage newMessage= new SimpleMailMessage();
        newMessage.setTo(to);
        newMessage.setSubject(subject);
        newMessage.setText(body);
        return ResponseEntity.ok("success");
    }
}
