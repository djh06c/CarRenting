package com.example.carrenting_2_electric_boogaloo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @Column(name = "DriverLicenceNumber")
    private String driverLicenceNumber;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Zip")
    private String zip;

    @Column(name = "City")
    private String city;

    @Column(name = "MobilePhone")
    private String mobilePhone;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "DriverSinceDate")
    private LocalDate driverSinceDate;
}
