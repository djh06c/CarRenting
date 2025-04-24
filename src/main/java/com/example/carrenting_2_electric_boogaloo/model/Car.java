package com.example.carrenting_2_electric_boogaloo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @Column(name = "RegistrationNumber")
    private String registrationNumber;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Model")
    private String model;

    @Column(name = "FuelType")
    private String fuelType;

    @Column(name = "FirstRegistrationDate")  // Rettet!
    private String firstRegistrationDate;

    @Column(name = "Odometer")
    private int odometer;

    @Enumerated(EnumType.STRING)
    @Column(name = "Category")
    private Category category;

    public enum Category {
        Luxury, Family, Sport
    }
}
