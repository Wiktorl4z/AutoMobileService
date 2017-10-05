package com.wiktor.hiress;

import com.wiktor.carss.Car;
import com.wiktor.customerss.Customer;
import lombok.Data;

import javax.persistence.*;
import java.time.*;


@Data
@Entity
public class Hire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private ZonedDateTime hireDate;
    private ZonedDateTime returnDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    public Hire() {
    }
}
