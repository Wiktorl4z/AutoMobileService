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

}
