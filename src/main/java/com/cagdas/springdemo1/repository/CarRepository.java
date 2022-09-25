package com.cagdas.springdemo1.repository;

import com.cagdas.springdemo1.repository.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<Car,Long> {


}

