package com.example.carrenting_2_electric_boogaloo.Controller;

import com.example.carrenting_2_electric_boogaloo.model.Car;
import com.example.carrenting_2_electric_boogaloo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CarPageController {

    @Autowired
    private CarRepository carRepo;

    @GetMapping("/Voresbiler/VoresBiler")
    public String VisBiler(Model model) {
        model.addAttribute("cars", carRepo.findAll());
        return "Voresbiler/VoresBiler";
    }
}
