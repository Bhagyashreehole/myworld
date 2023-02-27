package com.example.myworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MIchigan {
    @GetMapping("/welcometomichigan")
    public String getData(){
        return "please book your michigan flight tickets";
    }
}
