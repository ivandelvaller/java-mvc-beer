package com.ivandelvaller.mvcbeer.services;

import java.util.List;
import java.util.UUID;

import com.ivandelvaller.mvcbeer.models.Customer;

public interface CustomerService {
    List<Customer> getAll();

    Customer getById(UUID id);

    UUID save(Customer customer);

    void update(UUID id, Customer customer);

    void delete(UUID id);
}
