package com.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarSelling.bean.UserCar;



@Repository
public interface UserCarRepository extends JpaRepository<UserCar, Integer> {

}
