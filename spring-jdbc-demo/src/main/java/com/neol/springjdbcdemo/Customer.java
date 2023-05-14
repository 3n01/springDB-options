package com.neol.springjdbcdemo;

import lombok.Data;


@Data
public class Customer {
    private Long id;
    private String first_name;
    private String last_name;
    private String email;

}
