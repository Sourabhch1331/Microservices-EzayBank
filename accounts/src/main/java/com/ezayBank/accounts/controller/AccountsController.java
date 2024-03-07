package com.ezayBank.accounts.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("health")
    String health(){
        return "I am Healthy :), Thanks for caring";
    }
}
