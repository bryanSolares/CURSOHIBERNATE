package com.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AficionDeportivaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ADF_PER_ID")
	private int idPersonaPK;
	@Column(name = "ADF_DEP_CV", length = 12)
	private String cveDeportePK;
	@Column(name = "ADF_NUMAFI")
	private int numAficion;

	public AficionDeportivaPK() {
	}

	public AficionDeportivaPK(int idPersonaPK, String cveDeportePK, int numAficion) {
		super();
		this.idPersonaPK = idPersonaPK;
		this.cveDeportePK = cveDeportePK;
		this.numAficion = numAficion;
	}

	public int getIdPersonaPK() {
		return idPersonaPK;
	}

	public void setIdPersonaPK(int idPersonaPK) {
		this.idPersonaPK = idPersonaPK;
	}

	public String getCveDeportePK() {
		return cveDeportePK;
	}

	public void setCveDeportePK(String cveDeportePK) {
		this.cveDeportePK = cveDeportePK;
	}

	public int getNumAficion() {
		return numAficion;
	}

	public void setNumAficion(int numAficion) {
		this.numAficion = numAficion;
	}

	@Override
	public String toString() {
		return "AficionDeportivaPK [idPersonaPK=" + idPersonaPK + ", cveDeportePK=" + cveDeportePK + ", numAficion="
				+ numAficion + "]";
	}

}
