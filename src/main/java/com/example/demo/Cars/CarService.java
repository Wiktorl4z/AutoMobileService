package com.example.demo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }

    public Car getCarId(Long id) {
        return carRepository.findOne(id);
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public void updateCar(Long id, Car car) {
        carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.delete(id);
    }
}
