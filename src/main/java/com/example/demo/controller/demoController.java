// DemoController.java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "index"; // index.htmlを参照する
    }
}