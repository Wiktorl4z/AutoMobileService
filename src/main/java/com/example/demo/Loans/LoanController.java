package com.example.demo.Loans;

import com.example.demo.Customers.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping("loans")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @RequestMapping("loans/{id}")
    public Loan getLoanId(@PathVariable Long id) {
        return loanService.getLoanId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loans")
    public void addCar(@RequestBody Loan loan) {
        loanService.addLoan(loan);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/loans/{id}")
    public void updateCar(@RequestBody Loan loan, @PathVariable Long id) {
        loanService.updateLoan(id, loan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/loans/{id}")
    public void updateCar(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }

    @RequestMapping("/loans/{id}/customers")
    public List<Loan> getAllCustomers(@PathVariable Long id) {
        return loanService.getAllCustomers(id);
    }

    @RequestMapping("/loans/{loansId}/customers/{id}")
    public Loan getCustomerId(@PathVariable Long id) {
        return loanService.getCustomerId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loans/{loansId}/customers")
    public void addCustomer(@RequestBody Loan loan, @PathVariable Long loansId) {
        loan.setCustomer(new Customer(loansId, "", "", (long) 1432));
        loanService.addCustomer(loan);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/loans/{loansId}/customers/{id}")
    public void updateCourse(@RequestBody Loan loan, @PathVariable Long loansId, @PathVariable Long id) {
        loan.setCustomer(new Customer(loansId, "", "", (long) 1432));
        loanService.updateCustomer(loan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/loans/{loansId}/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        loanService.deleteCourse(id);
    }
}