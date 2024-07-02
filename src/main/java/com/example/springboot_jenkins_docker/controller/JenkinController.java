package com.example.springboot_jenkins_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
    @GetMapping("/jenkins")
    public String getMsg(){
        return "Hello how are you ";
    }

}
