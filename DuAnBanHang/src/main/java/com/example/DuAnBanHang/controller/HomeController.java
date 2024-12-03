package com.example.DuAnBanHang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"", "/"})
    public String home() {
        return "Hello World";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }
}