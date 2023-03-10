package com.springbootacademy.batch8poinofsale.Service;

import com.springbootacademy.batch8poinofsale.DTO.CustomerDTO;
import com.springbootacademy.batch8poinofsale.DTO.Request.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CustomerDTO customerDTO);

    CustomerDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO);

    CustomerDTO getCustomerById(int customerId);

    List<CustomerDTO> getAllCustomers();

    String deleteCustomer(int customerId);
}
