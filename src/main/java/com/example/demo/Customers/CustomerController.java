package com.example.demo.Customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomerId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customerService.updateCustomer(id, customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}

