package com.entidades;

import javax.persistence.*;

@Entity
@Table(name = "EMP_EMPRESA")
public class Empresa {

	@Id
	@Column(name = "EMP_ID_FISCAL", length = 40)
	private String idFiscal;
	@Column(name = "EMP_NOMBRECOMERCIAL", length = 40)
	private String nombreComercial;
	@Column(name = "EMP_RAZONSOCIAL", length = 40)
	private String razonSocial;
	@ManyToOne
	@JoinColumns({ 
			@JoinColumn(name = "EMP_PLACAS_AUTO", referencedColumnName = "AUT_PLACA"),
			@JoinColumn(name = "EMP_CVE_PAIS_AUTO", referencedColumnName = "AUT_CVE_PAIS") })
	private Automovil autoPatrocinado;

	public Empresa() {
	}

	public Empresa(String idFiscal, String nombreComercial, String razonSocial) {
		super();
		this.idFiscal = idFiscal;
		this.nombreComercial = nombreComercial;
		this.razonSocial = razonSocial;
	}

	public String getIdFiscal() {
		return idFiscal;
	}

	public void setIdFiscal(String idFiscal) {
		this.idFiscal = idFiscal;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Automovil getAutoPatrocinado() {
		return autoPatrocinado;
	}

	public void setAutoPatrocinado(Automovil autoPatrocinado) {
		this.autoPatrocinado = autoPatrocinado;
	}

	@Override
	public String toString() {
		return "Empresa [idFiscal=" + idFiscal + ", nombreComercial=" + nombreComercial + ", razonSocial=" + razonSocial
				+ "]";
	}

}
