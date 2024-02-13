package com.example.sendemail.servise;

import org.springframework.http.ResponseEntity;

public interface UserServise {
    ResponseEntity<?> sendEmail(String to, String subject,String body);
}
