package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

//-------------------

    @GetMapping("/rolldice/{guess}")
    
     public String rolldice(@PathVariable int guess, Model model) {

        int random = (int)(Math.random() * 6 +1);

        model.addAttribute ("Rnum", random);
        model.addAttribute("Gnum", guess);

        System.out.println(random);

        return "rolldice";

    }  //end dice method -----

@GetMapping("/templates/posts/index")
    public String index() {
        return "index";
}
@GetMapping("/templates/posts/show")
    public String show(){
        return "show";
}


}  //end pers controller
