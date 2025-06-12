package com.example.commons.proyecto.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "AEROPUERTOS")
public class Aeropuerto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AEROPUERTO_SEQ")
	@SequenceGenerator(name = "AEROPUERTO_SEQ", sequenceName = "AEROPUERTO_SEQ", allocationSize = 1)
	@Column(name = "ID_AEROPUERTO")
	private Long id;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "CDIGO", nullable = false)
	private String codigo;
	
	@Column(name = "LATITUD", nullable = false)
	private String latitud;
	
	@Column(name = "LONGITUD", nullable = false)
	private String longitud;
	
	@Column(name = "PAIS", nullable = false)
	private String pais;
	
	@Column(name = "ID_ESTATUS", nullable = false)
	private Long idEstatus;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Long idEstatus) {
		this.idEstatus = idEstatus;
	}
	
	
	
}
