package com.company.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String getLogin() {
        System.out.println("getLogin");
        return "login";
    }

    @GetMapping("courses")
    public String getCourses() {
        System.out.println("courses");
        return "courses";
    }
}
