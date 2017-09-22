package com.example.demo.Loans;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loan,Long>{

    public List<Loan>findByCustomerId(Long customerId);
}
