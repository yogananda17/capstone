package com.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarSelling.bean.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	
	

}
