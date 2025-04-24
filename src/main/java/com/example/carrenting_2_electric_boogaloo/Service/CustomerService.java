package com.example.carrenting_2_electric_boogaloo.Service;

import com.example.carrenting_2_electric_boogaloo.model.Customer;
import com.example.carrenting_2_electric_boogaloo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }


}
