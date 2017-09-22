package com.example.demo.Customers;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;

@Data
@Entity
public class Customer {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Long documentId;
}
