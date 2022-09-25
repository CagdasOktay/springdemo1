package com.cagdas.springdemo1.service;


import com.cagdas.springdemo1.repository.CarRepository;
import com.cagdas.springdemo1.repository.entities.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public void save(Car car) {

        carRepository.save(car);

    }


    public List<Car> findAll() {

        return carRepository.findAll();
    }
}
