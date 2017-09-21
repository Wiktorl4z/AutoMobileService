package com.example.demo.Loans;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;

@Data
@Entity
public class Loan {

    @Id
    private Boolean toLend;
}
