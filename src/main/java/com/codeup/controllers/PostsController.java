package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PostsController {

    @GetMapping("/posts")
    @ResponseBody
    public String viewAll() {
        return null;
    }
    @GetMapping("/posts/{id} ")
    @ResponseBody
    public String viewIndividualPost(){return null;}

}
