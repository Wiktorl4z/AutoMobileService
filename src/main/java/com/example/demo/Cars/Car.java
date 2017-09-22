package com.example.demo.Cars;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Car {

    @Id
    private Long id;
    private String name;
    private Long price;
    private Long engine;

    public Car(){}

    public Car(Long id, String name, Long price, Long engine) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.engine = engine;
    }
}
