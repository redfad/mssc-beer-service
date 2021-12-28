package com.example.msscbeerservice.web.services;

import com.example.msscbeerservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void deleteCustomer(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);
}
