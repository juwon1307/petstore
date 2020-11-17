package com.petstore.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

   @GetMapping("/welcome/tope")
    public @ResponseBody String welcomeMessage() {

       return "Pet Store Application yeah!";
   }

   @GetMapping("/page")
   public String displayWelcomePage(){
       return "welcome";

   }
}
