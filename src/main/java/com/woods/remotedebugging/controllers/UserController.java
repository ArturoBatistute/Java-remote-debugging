package com.woods.remotedebugging.controllers;

import com.woods.remotedebugging.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/users")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    private ResponseEntity<String> analyze(){

        return ResponseEntity.ok(userService.analyzeInformation());
    }
}
