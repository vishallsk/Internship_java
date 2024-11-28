package com.firstconnection.service;

import com.firstconnection.model.Customer;
import com.firstconnection.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Retrieve all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Retrieve a customer by their ID
    public Customer getCustomerById(Long id) { // Updated from customerId to id
        return customerRepository.findById(id).orElse(null);
    }

    // Save or update a single customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Save or update multiple customers
    public List<Customer> saveAllCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    // Delete a customer by their ID
    public void deleteCustomer(Long id) { // Updated from customerId to id
        customerRepository.deleteById(id);
    }
}
