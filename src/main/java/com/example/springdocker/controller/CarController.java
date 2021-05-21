package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService service;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("/cars")
    public void saveNewCar(@RequestBody Car car) {
        service.saveNewCar(car);
    }

    @GetMapping("/cars/drivable")
    public List<String> getDrivableCars() {
        return service.getDriveableCars();
    }

    @GetMapping("/addCar")
    public List<Car> addCars() {
        Car car = new Car();
        car.setName("Volvo");
        car.setCanIDriveIt(true);
        car.setLooksGood(true);
        service.saveNewCar(car);
        return Arrays.asList(car);
    }
}
