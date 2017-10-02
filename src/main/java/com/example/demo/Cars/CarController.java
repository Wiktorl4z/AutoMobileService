package com.example.demo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @RequestMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCarId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable Long id) {
        carService.updateCar(id, car);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void updateCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
