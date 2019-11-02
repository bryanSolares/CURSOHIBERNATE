package com.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "EMP_EMPLEADO")
@TableGenerator(name = "GENERADOR_EMPLEADO", 
				table = "FOL_FOLIO", pkColumnName = "FOL_ID", 
				valueColumnName = "FOL_NETXVALUE", initialValue = 1, pkColumnValue = "EMPLEADO", allocationSize = 2)
public class Empleado {

	@Id
	@Column(name = "EMP_NUMEMPLEADO")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "GENERADOR_EMPLEADO")
	private long numEmpleado;
	@Column(name = "EMP_NOMBRE", length = 45)
	private String nombre;
	@Column(name = "EMP_PUESTO", length = 30)
	private String puesto;
	
	public Empleado() {

	}

	
	public Empleado(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}


	public long getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(long numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	
	
}
