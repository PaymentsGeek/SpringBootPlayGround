package com.example.postconstruct1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class CustomerController {

    @Autowired
    CustomerService cService;

    public CustomerController() {
//        System.out.println(cService.getCustomer());
        System.out.println("Constructor: customer controller");
    }

    @PostConstruct
    public void getCustomer() {
        System.out.println(cService.getCustomer());
        System.out.println("get customer");
    }
}
