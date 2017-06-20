package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

  @Controller
   public class MathController {

  @ResponseBody
   public double add(@PathVariable int number1, @PathVariable int number2){
       return (double) number1 + number2 ;}

//-----------------
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable  String name) {
//        return "Hello " + name + "!";
//    }
//---------------
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }

//    @RequestMapping(path = "/add/{number1}/{number2}",  method = RequestMethod.GET)
//    @ResponseBody
//    public String addTwoNumbers(@PathVariable int number1, @PathVariable int number2) {
//        return number1 + " + " + number2 + " = " + (number1 + number2);
//    }


//    @GetMapping("/add/3/and/4/{3},{4}")    //getMapp is shorthand for the @RequestMapp and REQ method shown below
//     @ResponseBody
//    public Integer addTwoNumbers(){
//        return 3+4;
//    }


}  // the end of main math class
