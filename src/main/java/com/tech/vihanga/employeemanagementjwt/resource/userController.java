package com.tech.vihanga.employeemanagementjwt.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class userController {

    @GetMapping("/users")
    public String showUser() {
        return "This works bro";
    }
}
