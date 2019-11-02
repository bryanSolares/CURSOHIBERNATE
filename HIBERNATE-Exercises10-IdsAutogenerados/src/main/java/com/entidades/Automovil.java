package com.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUT_AUTOMOVIL")
public class Automovil {

	@EmbeddedId
	private AutomovilPK llave;
	@Column(name = "AUT_FABRICANTE", length = 30)
	private String fabricante;
	@Column(name = "AUT_MODELO", length = 30)
	private String modelo;
	@Column(name = "AUT_ANIO")
	private int anio;
	@Column(name = "AUT_COLOR", length = 30)
	private String color;
	@Column(name = "AUT_KILOMETRAJE")
	private int kilometraje;
	@OneToMany(mappedBy = "autoPatrocinado")
	private List<Empresa> patrocinadores;

	public Automovil() {

	}

	public Automovil(AutomovilPK llave, String fabricante, String modelo, int anio, String color, int kilometraje) {
		super();
		this.llave = llave;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.kilometraje = kilometraje;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public AutomovilPK getLlave() {
		return llave;
	}

	public void setLlave(AutomovilPK llave) {
		this.llave = llave;
	}

	public List<Empresa> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Empresa> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color
				+ ", kilometraje=" + kilometraje + " LLAVE: " + llave + "]";
	}

}
