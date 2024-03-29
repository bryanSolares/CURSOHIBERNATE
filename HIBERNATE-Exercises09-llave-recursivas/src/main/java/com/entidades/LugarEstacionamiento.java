package com.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EST_ESTACIONAMIENTO")
public class LugarEstacionamiento {

	@Id
	@Column(name = "EST_NUMLUGAR")
	private int numLugar;
	@Column(name = "EST_EDIFICIO", nullable = false, length = 60)
	private String edificio;
	@Column(name = "EST_PISO", nullable = false, length = 30)
	private String piso;
	@Column(name = "EST_COORDENADAS", nullable = false, length = 50)
	private String coordenadas;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PER_ID", referencedColumnName = "PER_ID")
	private Persona persona;
	
	public LugarEstacionamiento() {
	}

	public LugarEstacionamiento(int numLugar, String edificio, String piso, String coordenadas) {
		this.numLugar = numLugar;
		this.edificio = edificio;
		this.piso = piso;
		this.coordenadas = coordenadas;
	}

	public int getNumLugar() {
		return numLugar;
	}

	public void setNumLugar(int numLugar) {
		this.numLugar = numLugar;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "LugarEstacionamiento [numLugar=" + numLugar + ", edificio=" + edificio + ", piso=" + piso
				+ ", coordenadas=" + coordenadas  + " Asignado A: " + persona.getNombre() + "]";
	}

	
	
}
