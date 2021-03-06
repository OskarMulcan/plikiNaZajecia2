package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepo;


    @GetMapping("/car")
    public List<Car> getAllCars(){
        return carRepo.findAll();

    }
}
