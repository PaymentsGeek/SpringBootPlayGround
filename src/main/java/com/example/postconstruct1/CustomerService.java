package com.example.postconstruct1;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public CustomerService() {
        System.out.println("Constructor: customerService");

    }
    public Customer getCustomer () {
        return new Customer ("Prakash1", "Sydney") ;

    }
}
