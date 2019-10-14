package com.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidades.Persona;

public class GestorPersistencia {

	private EntityManagerFactory fabrica;

	public GestorPersistencia() {
		this.fabrica = Persistence.createEntityManagerFactory("miBaseDeDatos");
	}

	public Persona getPersonaPorId(int id) {
		EntityManager manager = this.fabrica.createEntityManager();
		Persona persona = (Persona) manager.find(Persona.class, id);
		manager.close();
		return persona;
	}

	public void cerrar() {
		this.fabrica.close();
	}

}
