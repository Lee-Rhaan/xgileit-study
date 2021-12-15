package com.mfs.client.tnmmwi.service;

import org.springframework.stereotype.Service;
import com.mfs.client.tnmmwi.persistence.CustomerRepository;
import lombok.RequiredArgsConstructor;
import com.mfs.client.tnmmwi.persistence.model.Customer;

/**
 * Handles the implementation of a customer getting persisted
 */

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    /**
     * Persisting customer into database
     * @param customer object
     * @return String message 
     */
    public String createCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customer Saved Successfully";
    }
}