package com.neol.springjdbcdemo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    private final JdbcTemplate jdbcTemplate;

    public CustomerRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Customer> findById(Long id) {
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return jdbcTemplate.query("SELECT  * FROM customer where id=" + id, rowMapper);
    }

    @Override
    public void save(Customer customer) {
        jdbcTemplate.update("INSERT INTO customer values (?, ?, ?, ?)", customer.getId(), customer.getFirst_name(), customer.getLast_name(), customer.getEmail());
    }
}
