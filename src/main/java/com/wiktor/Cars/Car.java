package com.wiktor.Cars;

import com.wiktor.Hires.Hire;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private BigDecimal price;
    private String engine;
    @JsonIgnore
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<Hire> hire;

    public Car() {
    }
}
