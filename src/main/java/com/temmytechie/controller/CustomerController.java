package com.temmytechie.controller;

import com.temmytechie.dto.Customer;
import com.temmytechie.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customersInfo")
public class CustomerController {


    @Autowired
    private CustomerService service;


    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        service.addCustomer(customer);
        return customer;
    }

    @GetMapping
    public List<Customer> getCustomers()
    {
        return service.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id)
    {
        return service.getCustomer(id);
    }
}
