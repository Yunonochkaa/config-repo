package com.example.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Value("${my.custom.property}")
    private String customProperty;

    @GetMapping("/config")
    public String getConfig() {
        return customProperty;
    }
}
