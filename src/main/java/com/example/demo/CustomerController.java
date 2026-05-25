package com.example.demo;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // Allow requests from React app
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
 private final CustomerService customerService;

 public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
 @GetMapping("/")
    public List<CustomerMachine> getCustomers() {
        return customerService.getCustomers();
    }

}
