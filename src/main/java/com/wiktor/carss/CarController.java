package com.wiktor.carss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @RequestMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCarId(id);
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @PutMapping(value = "/{id}")
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
