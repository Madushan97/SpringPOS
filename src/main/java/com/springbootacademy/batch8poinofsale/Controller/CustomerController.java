package com.springbootacademy.batch8poinofsale.Controller;

import com.springbootacademy.batch8poinofsale.DTO.CustomerDTO;
import com.springbootacademy.batch8poinofsale.DTO.Request.CustomerUpdateDTO;
import com.springbootacademy.batch8poinofsale.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//define rest api
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

        customerService.saveCustomer(customerDTO);
        return "save Customer";
    }

    @PutMapping(path = "/update")
    public CustomerDTO updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {

        return customerService.updateCustomer(customerUpdateDTO);
    }

    @GetMapping(path = "/getById", params = {"id"})
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerId) {

        return customerService.getCustomerById(customerId);
    }

    @GetMapping(path = "/getAllCustomers")
    public List<CustomerDTO> getAllCustomers() {

        List<CustomerDTO> allCustomer = customerService.getAllCustomers();

        return allCustomer;
    }

    @DeleteMapping(path = "/deleteById/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int customerId) {
        String deleted = customerService.deleteCustomer(customerId);
        return deleted;
    }
}
