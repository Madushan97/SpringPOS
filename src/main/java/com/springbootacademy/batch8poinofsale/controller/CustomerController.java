package com.springbootacademy.batch8poinofsale.controller;

import com.springbootacademy.batch8poinofsale.dto.CustomerDTO;
import com.springbootacademy.batch8poinofsale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

        customerService.saveCustomer(customerDTO);

        return "controller - saved customer";
    }
}
