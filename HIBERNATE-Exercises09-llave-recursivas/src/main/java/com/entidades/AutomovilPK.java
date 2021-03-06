package com.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AutomovilPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "AUT_PLACA", length = 10)
	private String placa;
	@Column(name = "AUT_CVE_PAIS", length = 5)
	private String cvePais;

	public AutomovilPK() {
	}

	public AutomovilPK(String placa, String cvePais) {
		super();
		this.placa = placa;
		this.cvePais = cvePais;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCvePais() {
		return cvePais;
	}

	public void setCvePais(String cvePais) {
		this.cvePais = cvePais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cvePais == null) ? 0 : cvePais.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutomovilPK other = (AutomovilPK) obj;
		if (cvePais == null) {
			if (other.cvePais != null)
				return false;
		} else if (!cvePais.equals(other.cvePais))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AutomovilPK [placa=" + placa + ", cvePais=" + cvePais + "]";
	}

}
