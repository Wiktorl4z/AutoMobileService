package com.wiktor.customerss;

import com.wiktor.hiress.Hire;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private long documentId;
    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Hire> hire;

    public Customer() {
    }
}
