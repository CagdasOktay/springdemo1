package com.cagdas.springdemo1.controller;


import com.cagdas.springdemo1.repository.entities.Car;
import com.cagdas.springdemo1.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {



    private final CarService carService;


    @GetMapping("/save")
    public ResponseEntity<Void> save (String brand,String carModel,String modelYear){

        carService.save(Car.builder().brand(brand).carModel(carModel).modelYear(modelYear).build());

        return ResponseEntity.ok().build();

    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Car>> findAll(){

        return ResponseEntity.ok(carService.findAll());

    }


}
