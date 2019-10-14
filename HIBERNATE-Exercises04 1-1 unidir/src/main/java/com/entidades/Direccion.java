package com.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIR_DIRECCION")
public class Direccion {

	@Id
	@Column(name = "DIR_ID")
	private int idDireccion;
	@Column(name = "DIR_CALLE", length = 50, nullable = false)
	private String calle;
	@Column(name = "DIR_NUMEXTERIOR", length = 20, nullable = false)
	private String numExterior;
	@Column(name = "DIR_NUMINTERIOR", length = 20, nullable = false)
	private String numInterior;
	@Column(name = "DIR_COLONIA", length = 50, nullable = false)
	private String colonia;

	public Direccion() {
	}

	public Direccion(int idDireccion, String calle, String numExterior, String numInterior, String colonia) {
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numExterior = numExterior;
		this.numInterior = numInterior;
		this.colonia = colonia;
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumExterior() {
		return numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getNumInterior() {
		return numInterior;
	}

	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", calle=" + calle + ", numExterior=" + numExterior
				+ ", numInterior=" + numInterior + ", colonia=" + colonia + "]";
	}

}
