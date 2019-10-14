package com.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "PER_PERSONA")
public class Persona {

	@Id
	@Column(name = "PER_ID")
	private int idPersonas;
	@Column(name = "PER_NOMBRE", nullable = false, length = 60)
	private String nombre;
	@Column(name = "PER_PROFESION", length = 80)
	private String profesion;
	@Column(name = "PER_FECHANAC")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	@Column(name = "PER_ID_FISCAL", unique = true, length = 25)
	private String nit;
	@Transient
	private int edad;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PER_ID", referencedColumnName = "DIR_ID")
	private Direccion direccion;
	@OneToOne(mappedBy = "persona")
	private LugarEstacionamiento estacionamiento;
	@OneToMany(mappedBy = "persona", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Mascota> mascotas;

	@Embedded
	private NombreCompleto nombreCompleto;

	public Persona() {
		this.mascotas = new HashSet<>();
	}

	public Persona(int idPersonas, String nombre, String profesion, Date fechaNacimiento, String nit, int edad,
			Direccion direccion, NombreCompleto nombreCompleto) {
		this.idPersonas = idPersonas;
		this.nombre = nombre;
		this.profesion = profesion;
		this.fechaNacimiento = fechaNacimiento;
		this.nit = nit;
		this.edad = edad;
		this.direccion = direccion;
		this.nombreCompleto = nombreCompleto;
		this.mascotas = new HashSet<>();
	}

	public int getIdPersonas() {
		return idPersonas;
	}

	public void setIdPersonas(int idPersonas) {
		this.idPersonas = idPersonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public NombreCompleto getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(NombreCompleto nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public LugarEstacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(LugarEstacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Persona [idPersonas=" + idPersonas + ", nombre=" + nombre + " mascotas pertenecientes: " + mascotas.toString() + "]";
	}

}
