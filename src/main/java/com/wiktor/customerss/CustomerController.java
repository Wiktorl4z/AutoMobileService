package com.wiktor.customerss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomerId(id);
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @PutMapping(value = "/{id}")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}

