package com.example.commons.proyecto.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AeropuertoRequest(
		@NotBlank(message = "El nombre no debe ser vacío ni nulo")
		String nombre,
		
		@NotBlank(message = "El código no debe ser vacío ni nulo")
		String codigo,
		
		@NotBlank(message = "La latitud no debe ser vacío ni nulo")
		String latitud,
		
		@NotBlank(message = "La longitud no debe ser vacío ni nulo")
		String longitud,
		
		@NotBlank(message = "El pais no debe ser vacío ni nulo")
		String pais,
		
		@NotNull(message = "El Estatus no puede ser nulo")
		@Min(value = 1, message = "El estatus debe ser mínimo 1")
		@Max(value = 2, message = "El estatus debe ser máximo 2")
		Long idEstatus
	) {

}
