package com.example.carrenting_2_electric_boogaloo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    private String registrationNumber;
    private String brand;
    private String model;
    private String fuelType;
    private String firstRegistrationDate;
    private int odometer;

    @Enumerated(EnumType.STRING)
    private Category category;

    public enum Category {
        Luxury, Family, Sport
    }
}
