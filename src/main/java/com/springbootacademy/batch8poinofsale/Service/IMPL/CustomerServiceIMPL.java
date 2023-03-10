package com.springbootacademy.batch8poinofsale.Service.IMPL;

import com.springbootacademy.batch8poinofsale.DTO.CustomerDTO;
import com.springbootacademy.batch8poinofsale.DTO.Request.CustomerUpdateDTO;
import com.springbootacademy.batch8poinofsale.Entity.Customer;
import com.springbootacademy.batch8poinofsale.Repository.CustomerRepo;
import com.springbootacademy.batch8poinofsale.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    //    save customers
    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getContactNumber(),
                customerDTO.getNic(),
                customerDTO.isActiveStatus()
        );

        customerRepo.save(customer);

        return customerDTO.getCustomerName() + " saved successfully";
    }

    //    update customers
    @Override
    public CustomerDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO) {

        if (customerRepo.existsById(customerUpdateDTO.getCustomerId())) {
//          this is an Entity type
            Customer updateCustomer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId());

            updateCustomer.setCustomerName(customerUpdateDTO.getCustomerName());
            updateCustomer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
            updateCustomer.setNic(customerUpdateDTO.getNic());

            customerRepo.save(updateCustomer);

            CustomerDTO updatedCustomerDTO = new CustomerDTO(
                    updateCustomer.getCustomerId(),
                    updateCustomer.getCustomerName(),
                    updateCustomer.getCustomerAddress(),
                    updateCustomer.getContactNumber(),
                    updateCustomer.getNic(),
                    updateCustomer.isActiveStatus()
            );

            return updatedCustomerDTO;
        } else {
            throw new ArithmeticException("Customer does not exist");
        }
    }

    //    get one customer
    @Override
    public CustomerDTO getCustomerById(int customerId) {

        if (customerRepo.existsById(customerId)) {
            Customer getCustomer = customerRepo.getReferenceById(customerId);

            CustomerDTO getCustomerDTO = new CustomerDTO(
                    getCustomer.getCustomerId(),
                    getCustomer.getCustomerName(),
                    getCustomer.getCustomerAddress(),
                    getCustomer.getContactNumber(),
                    getCustomer.getNic(),
                    getCustomer.isActiveStatus()
            );
            return getCustomerDTO;

        } else {
            throw new ArithmeticException("Customer does not exist");
        }
    }

    //    get all customers
    @Override
    public List<CustomerDTO> getAllCustomers() {

        List<Customer> allCustomers = customerRepo.findAll();

        if (allCustomers.size() > 0) {
            List<CustomerDTO> customerDTOList = new ArrayList<>();

            for (Customer customer : allCustomers) {
                CustomerDTO customerDTO = new CustomerDTO(
                        customer.getCustomerId(),
                        customer.getCustomerName(),
                        customer.getCustomerAddress(),
                        customer.getContactNumber(),
                        customer.getNic(),
                        customer.isActiveStatus()
                );

                customerDTOList.add(customerDTO);

            }
            return customerDTOList;
        } else {
            throw new RuntimeException("No Customers in database");
        }
    }

    @Override
    public String deleteCustomer(int customerId) {

        if (customerRepo.existsById(customerId)) {
            customerRepo.deleteById(customerId);
            return "deleted successfully " + customerId;
        }
        else {
            throw new RuntimeException("No Customers in database");
        }
    }
}

