package com.example.demo.Loans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @RequestMapping("/loans/")
    public List<Loan> getAllLoans() {
        List<Loan> loans = new ArrayList<>();
        loanRepository.findAll().forEach(loans::add);
        return loans;
    }

    public Loan getLoanId(Long id) {
        return loanRepository.findOne(id);
    }

    public void addLoan(Loan loan) {
        loanRepository.save(loan);
    }

    public void updateLoan(Long id, Loan loan) {
        loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.delete(id);
    }

    public List<Loan> getAllCustomers(Long customerId) {
        List<Loan> courses = new ArrayList<>();
        loanRepository.findByCustomerId(customerId)
                .forEach(courses::add);
        return courses;
    }

    public void addCustomer(Loan loan) {
        loanRepository.save(loan);
    }

    public void deleteCourse(Long id) {
        loanRepository.delete(id);
    }

    public Loan getCustomerId(Long id) {
        return loanRepository.findOne(id);
    }

    public void updateCustomer(Loan loan) {
        loanRepository.save(loan);
    }
}
