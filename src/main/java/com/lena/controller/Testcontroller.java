package com.lena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {

    @RequestMapping("/index")
    public String getIndex(){
        return "index.html";
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "/page/login/login";
    }

    @RequestMapping("/main")
    public String getMain(){
        return "/page/main";
    }

    @RequestMapping("/customerlist")
    public String getcustomerlist(){
        return "/page/customer/customerlist";
    }
}
