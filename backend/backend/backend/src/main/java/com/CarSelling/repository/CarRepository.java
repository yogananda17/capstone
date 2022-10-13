package com.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarSelling.bean.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

}
