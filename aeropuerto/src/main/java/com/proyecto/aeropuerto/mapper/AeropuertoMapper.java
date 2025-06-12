package com.proyecto.aeropuerto.mapper;

import org.springframework.stereotype.Component;

import com.example.commons.proyecto.dto.AeropuertoRequest;
import com.example.commons.proyecto.dto.AeropuertoResponse;
import com.example.commons.proyecto.mappers.CommonMapper;
import com.example.commons.proyecto.models.entities.Aeropuerto;

@Component
public class AeropuertoMapper extends CommonMapper<AeropuertoRequest, AeropuertoResponse, Aeropuerto>{
	
	@Override
	public AeropuertoResponse entityToDTO(Aeropuerto entity) {
		if (entity != null) {
			AeropuertoResponse response = new AeropuertoResponse(entity.getId(), entity.getNombre(),
					entity.getCodigo(), entity.getLatitud(), entity.getLongitud(), entity.getPais(),
					entity.getIdEstatus());
			return response;
		}
		return null;
	}

	@Override
	public Aeropuerto dtoToEntity(AeropuertoRequest request) {
		if (request != null) {
			Aeropuerto aeropuerto = new Aeropuerto();
			aeropuerto.setNombre(request.nombre());
			aeropuerto.setCodigo(request.codigo());
			aeropuerto.setLatitud(request.latitud());
			aeropuerto.setLongitud(request.longitud());
			aeropuerto.setPais(request.pais());
			aeropuerto.setIdEstatus(request.idEstatus());
			return aeropuerto;
		}
		return null;
	}

}
