package com.temmytechie.controller;

import com.temmytechie.client.CustomerClientService;
import com.temmytechie.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer-service")
public class CustomerClientController {

    @Autowired
    private CustomerClientService clientService;


    @GetMapping("/rest/consumer")
    public List<Customer> fetchCustomers()
    {
        return clientService.getAllCustomers();
    }
}
