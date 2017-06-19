package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonalController {
    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }
    @GetMapping("/portfolio")
    public String porfolio() {
        return "portfolio";
    }
    @GetMapping("/rolldice")
    public String rolldice() {
        return "rolldice";
    }
}
