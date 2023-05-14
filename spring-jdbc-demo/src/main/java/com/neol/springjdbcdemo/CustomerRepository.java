package com.neol.springjdbcdemo;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findById(Long id);

    void save(Customer customer);
}
