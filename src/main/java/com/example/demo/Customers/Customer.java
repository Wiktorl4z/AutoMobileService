package com.example.demo.Customers;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;

@Data
@Entity
public class  Customer {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Long documentId;

    public Customer(){}

    public Customer(Long id, String firstName, String lastName, Long documentId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
    }
}
