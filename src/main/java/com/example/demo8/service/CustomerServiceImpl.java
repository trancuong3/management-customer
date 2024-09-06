package com.example.demo8.service;

import com.example.demo8.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.stream()
                .filter(c -> c.getId()==(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customers.removeIf(c -> c.getId()==(customer.getId()));
        customers.add(customer);
    }
}
