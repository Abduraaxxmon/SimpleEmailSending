package com.example.sendemail.Controller;

import com.example.sendemail.servise.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserServise servise;

    @PostMapping
    public ResponseEntity<?> sending(String to,String subject,String text){
        return servise.sendEmail(to,subject,text);
    }
}
