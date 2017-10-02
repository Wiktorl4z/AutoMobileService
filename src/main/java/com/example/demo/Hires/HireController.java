package com.example.demo.Hires;

import com.example.demo.Cars.Car;
import com.example.demo.Customers.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("hires")
@RestController
public class HireController {

    @Autowired
    private HireService hireService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Hire> getAllHires() {
        return hireService.getAllHires();
    }

    @RequestMapping("/{id}")
    public Hire getHireId(@PathVariable Long id) {
        return hireService.getHireId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody Hire hire) {
        hireService.addHire(hire);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCar(@RequestBody Hire hire, @PathVariable Long id) {
        hireService.updateHire(id, hire);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void updateCar(@PathVariable Long id) {
        hireService.deleteHire(id);
    }

}