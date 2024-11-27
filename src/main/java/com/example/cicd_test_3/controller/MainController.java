package com.example.cicd_test_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main() {
        return "This is container 기반 CICD Test v3";
    }
}
