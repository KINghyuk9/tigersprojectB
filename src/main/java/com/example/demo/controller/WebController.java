package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class WebController {

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/create")
    public String create() { return "create";}

}

