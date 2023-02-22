package com.springbootacademy.batch8poinofsale.service.impl;

import com.springbootacademy.batch8poinofsale.dto.CustomerDTO;
import com.springbootacademy.batch8poinofsale.entity.Customer;
import com.springbootacademy.batch8poinofsale.repo.CustomerRepo;
import com.springbootacademy.batch8poinofsale.repo.CustomerRepo;
import com.springbootacademy.batch8poinofsale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {

//        dto data tika entity ekata
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getContactNumbers(),
                customerDTO.getNic(),
                customerDTO.isActiveStatus()

        );
        customerRepo.save(customer);

        return customerDTO.getCustomerName() + "saved :)";
    }
}
