package com.proyecto.aeropuerto.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.commons.proyecto.dto.AeropuertoRequest;
import com.example.commons.proyecto.dto.AeropuertoResponse;
import com.example.commons.proyecto.models.entities.Aeropuerto;
import com.proyecto.aeropuerto.mapper.AeropuertoMapper;
import com.proyecto.aeropuerto.models.repositories.AeropuertoRepository;


@Service
public class AeropuertoServiceImpl implements AeropuertoService{
	
	private AeropuertoRepository repository;
	
	private AeropuertoMapper mapper;
	
	public AeropuertoServiceImpl(AeropuertoRepository repository, AeropuertoMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	@Transactional(readOnly = true)
	public List<AeropuertoResponse> listar() {
		List<AeropuertoResponse> aeropuertos = new ArrayList<>();
		repository.findAll().forEach(aeropuerto -> {
			aeropuertos.add(mapper.entityToDTO(aeropuerto));
		});
		return aeropuertos;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<AeropuertoResponse> obtenerPorId(Long id) {
		Optional<Aeropuerto> aeropuerto = repository.findById(id);
		if (aeropuerto.isPresent()) {
			return Optional.of(mapper.entityToDTO(aeropuerto.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public AeropuertoResponse insertar(AeropuertoRequest request) {
		Aeropuerto aeropuerto = mapper.dtoToEntity(request);
		return mapper.entityToDTO(repository.save(aeropuerto));
	}

	@Override
	@Transactional
	public AeropuertoResponse actualizar(AeropuertoRequest request, Long id) {
		Optional<Aeropuerto> aeropuerto = repository.findById(id);
		if (aeropuerto.isPresent()) {
			Aeropuerto aeropuertoDb = aeropuerto.get();
			aeropuertoDb.setId(id);
			aeropuertoDb.setNombre(request.nombre());
			aeropuertoDb.setCodigo(request.codigo());
			aeropuertoDb.setLatitud(request.latitud());
			aeropuertoDb.setLongitud(request.longitud());
			aeropuertoDb.setPais(request.pais());
			aeropuertoDb.setIdEstatus(request.idEstatus());
			return mapper.entityToDTO(aeropuertoDb);
		}
		return null;
	}

	@Override
	@Transactional
	public AeropuertoResponse eliminar(Long id) {
		Optional<Aeropuerto> aeropuerto = repository.findById(id);
		if (aeropuerto.isPresent()) {
			repository.deleteById(id);
			return mapper.entityToDTO(aeropuerto.get());
		}
		return null;
	}
	
	

}
