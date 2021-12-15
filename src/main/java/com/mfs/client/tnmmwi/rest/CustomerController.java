package com.mfs.client.tnmmwi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mfs.client.tnmmwi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import com.mfs.client.tnmmwi.persistence.model.Customer;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tnmmwi")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {

        String response = customerService.createCustomer(customer);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}