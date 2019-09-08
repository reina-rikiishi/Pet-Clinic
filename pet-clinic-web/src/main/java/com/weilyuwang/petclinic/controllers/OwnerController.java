package com.weilyuwang.petclinic.controllers;


import com.weilyuwang.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {  //Spring MVC is gonna automatically add a Model when this gets called.

        model.addAttribute("owners", ownerService.findAll()); //name of the property inside the Model
        //"owners" gonna contain all owners generated from ownerService.findAll().

        return "owners/index";
    }


    @RequestMapping("/find")
    public String findOwners() {

        return "notimplemented";
    }
}
