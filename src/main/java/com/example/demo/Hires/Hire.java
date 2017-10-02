package com.example.demo.Hires;

import com.example.demo.Cars.Car;
import com.example.demo.Customers.Customer;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Hire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Date hireDate;
    private Date returnDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    public Hire() {
    }
}
