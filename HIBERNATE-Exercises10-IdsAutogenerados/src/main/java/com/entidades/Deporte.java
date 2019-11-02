package com.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEP_DEPORTE")
public class Deporte {

	@Id
	@Column(name = "DEP_CVE", length = 12)
	private String cveDeporte;
	@Column(name = "DEP_NOMBRE", length = 30)
	private String nombre;
	@Column(name = "DEP_DESCRIPCION", length = 30)
	private String descripcion;
	
	public Deporte() {
	}

	public Deporte(String cveDeporte, String nombre, String descripcion) {
		super();
		this.cveDeporte = cveDeporte;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getCveDeporte() {
		return cveDeporte;
	}

	public void setCveDeporte(String cveDeporte) {
		this.cveDeporte = cveDeporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Deporte [cveDeporte=" + cveDeporte + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	

	
}
