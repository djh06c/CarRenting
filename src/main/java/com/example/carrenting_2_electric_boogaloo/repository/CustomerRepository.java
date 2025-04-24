package com.example.carrenting_2_electric_boogaloo.repository;

import com.example.carrenting_2_electric_boogaloo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
