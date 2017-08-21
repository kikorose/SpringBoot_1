package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;

@Cntroller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "index";
    }
}
