package com.example.carrenting_2_electric_boogaloo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
