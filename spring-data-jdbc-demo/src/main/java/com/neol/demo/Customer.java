package com.neol.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("customer")
public class Customer {
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private String email;

}
