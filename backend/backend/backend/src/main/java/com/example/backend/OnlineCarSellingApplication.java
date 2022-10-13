package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.CarSelling.bean")
@EnableJpaRepositories(basePackages = "com.CarSelling.repository")
public class OnlineCarSellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCarSellingApplication.class, args);
	}

}
