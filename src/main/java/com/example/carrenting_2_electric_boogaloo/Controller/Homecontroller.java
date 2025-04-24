package com.example.carrenting_2_electric_boogaloo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "/home/index";
    }
}
