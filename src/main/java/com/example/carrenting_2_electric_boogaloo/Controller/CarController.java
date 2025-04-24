package com.example.carrenting_2_electric_boogaloo.Controller;

import com.example.carrenting_2_electric_boogaloo.model.Car;
import com.example.carrenting_2_electric_boogaloo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepo;

    @GetMapping
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carRepo.save(car);
    }

    @GetMapping("/{regNum}")
    public Car getCar(@PathVariable String regNum) {
        return carRepo.findById(regNum).orElse(null);
    }

    @DeleteMapping("/{regNum}")
    public void deleteCar(@PathVariable String regNum) {
        carRepo.deleteById(regNum);
    }

}
