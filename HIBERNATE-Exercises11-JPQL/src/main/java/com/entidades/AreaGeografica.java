package com.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AG_AREA_GEO")
public class AreaGeografica {

	@Id
	@Column(name = "AG_CVE", length = 10)
	private String cvArea;
	@Column(name = "AG_NOMBRE", length = 50)
	private String nombre;
	@Column(name = "AG_TIP", length = 10)
	private String tipo;
	@Column(name = "AG_DESCRIPCION", length = 60)
	private String descripcion;
	@ManyToOne
	@JoinColumn(name = "AG_PADRE", referencedColumnName = "AG_CVE")
	private AreaGeografica areaPadre;
	@OneToMany(mappedBy = "areaPadre")
	private List<AreaGeografica> areasHijo;
	
	public AreaGeografica() {
		areasHijo = new ArrayList<>();
	}

	public AreaGeografica(String cvArea, String nombre, String tipo, String descripcion) {
		this.cvArea = cvArea;
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		areasHijo = new ArrayList<>();
	}

	public String getCvArea() {
		return cvArea;
	}

	public void setCvArea(String cvArea) {
		this.cvArea = cvArea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public AreaGeografica getAreaPadre() {
		return areaPadre;
	}

	public void setAreaPadre(AreaGeografica areaPadre) {
		this.areaPadre = areaPadre;
	}

	public List<AreaGeografica> getAreasHijo() {
		return areasHijo;
	}

	public void setAreasHijo(List<AreaGeografica> areasHijo) {
		this.areasHijo = areasHijo;
	}

	@Override
	public String toString() {
		return "AreaGeografica [cvArea=" + cvArea + ", nombre=" + nombre + ", tipo=" + tipo + ", descripcion="
				+ descripcion + "] QUIEN PADRE ES: " + areaPadre.getCvArea();
	}

}
