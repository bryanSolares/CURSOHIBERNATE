package com.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NombreCompleto {

	@Column(name = "PER_NOMBRE_PILA",length = 20)
	private String nombre;
	@Column(name = "PER_NOMBRES_OTROS", length = 40)
	private String otrosNombres;
	@Column(name = "PER_AP_PATERNO", length = 30)
	private String apPaterno;
	@Column(name = "PER_AP_MATERNO", length = 30)
	private String apMaterno;
	
	public NombreCompleto() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtrosNombres() {
		return otrosNombres;
	}

	public void setOtrosNombres(String otrosNombres) {
		this.otrosNombres = otrosNombres;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	
	
}
