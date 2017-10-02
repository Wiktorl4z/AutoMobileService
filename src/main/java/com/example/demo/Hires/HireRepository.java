package com.example.demo.Hires;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HireRepository extends CrudRepository<Hire,Long>{

    public List<Hire>findByCustomerId(Long customerId);
}
