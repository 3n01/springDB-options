package com.neol.springjdbcdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers/{id}")
    public List<Customer> getCustomer(@PathVariable Long id) {
        return customerRepository.findById(id);
    }

    @PostMapping("/customers")
    public boolean createCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return true;
    }
}
