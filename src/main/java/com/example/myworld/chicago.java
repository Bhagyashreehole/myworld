package com.example.myworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chicago{
    @GetMapping("/welcometochicago")
    public String getData() {
        return "please book your chicago flight tickets";
    }
}
