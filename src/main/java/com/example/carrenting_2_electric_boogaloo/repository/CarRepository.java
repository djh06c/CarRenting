package com.example.carrenting_2_electric_boogaloo.repository;

import com.example.carrenting_2_electric_boogaloo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> findByCategory(Car.Category category);
}
