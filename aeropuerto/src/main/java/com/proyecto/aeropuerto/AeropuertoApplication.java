package com.proyecto.aeropuerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.example.commons.proyecto.controllers","com.example.Aeropuerto"})
@EntityScan({"com.example.commons.proyecto.models.entities"})
public class AeropuertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeropuertoApplication.class, args);
	}

}
