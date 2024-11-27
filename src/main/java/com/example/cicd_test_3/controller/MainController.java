package com.example.cicd_test_3.controller;

import com.example.cicd_test_3.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserRepository userRepository;

    @GetMapping("/")
    public String main() {
        return "This is container 기반 CICD Test v3";
    }
}
