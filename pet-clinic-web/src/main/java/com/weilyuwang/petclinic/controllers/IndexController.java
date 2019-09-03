package com.weilyuwang.petclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//annotate this as controller
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";  //thymeleaf's gonna go back n look for a template called "index.html"
    }
}
