package com.ivandelvaller.mvcbeer.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ivandelvaller.mvcbeer.models.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Customer getById(UUID id) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public UUID save(Customer customer) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(UUID id, Customer customer) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(UUID id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
