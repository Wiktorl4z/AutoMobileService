package com.example.demo.Loans;

import com.example.demo.Cars.Car;
import com.example.demo.Customers.Customer;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Loan {

    @Id
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Car car;

    public Loan() {
    }

    public Loan(Long id, String name, String description, Long customerId, Long documentId, Long carId, Long price,
                Long engine) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.customer = new Customer(customerId, "", "", documentId);
        this.car = new Car(carId, "", price, engine);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setCar(Car car){
        this.car = car;
    }
}
