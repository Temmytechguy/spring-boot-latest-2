package com.temmytechie.client;

import com.temmytechie.dto.Customer;
import org.springframework.web.service.annotation.*;

import java.util.List;

@HttpExchange("/customersInfo")
public interface CustomerClientService {

    @GetExchange
     List<Customer> getAllCustomers();
}
