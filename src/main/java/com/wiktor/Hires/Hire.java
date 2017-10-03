package com.wiktor.Hires;

import com.wiktor.Cars.Car;
import com.wiktor.Customers.Customer;
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
    private LocalDateTime hireDate;
    private LocalDateTime returnDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    public Hire() {
    }
}
