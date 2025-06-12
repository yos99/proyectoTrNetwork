package com.proyecto.aeropuerto.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.commons.proyecto.controllers.CommonController;
import com.example.commons.proyecto.dto.AeropuertoRequest;
import com.example.commons.proyecto.dto.AeropuertoResponse;
import com.proyecto.aeropuerto.services.AeropuertoService;

@RestController
public class AeropuertoController extends CommonController<AeropuertoRequest, AeropuertoResponse, AeropuertoService> {

	public AeropuertoController(AeropuertoService service) {
		super(service);
	}

}
