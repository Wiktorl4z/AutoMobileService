package com.wiktor.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
     return carRepository.findAll();
    }

    public Car getCarId(Long id) {
        return carRepository.findOne(id);
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public void updateCar(Car car) {
        carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.delete(id);
    }
}
