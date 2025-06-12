package com.example.commons.proyecto.dto;

public record AeropuertoResponse(
		Long id,
		String nombre,
		String codigo,
		String latitud,
		String longitud,
		String pais,
		Long idEstatus
	) {

}
