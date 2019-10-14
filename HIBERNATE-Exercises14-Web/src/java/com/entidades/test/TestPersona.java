package com.entidades.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidades.Persona;

public class TestPersona {

	public static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("miBaseDeDatos");
	
	public static void main (String [] args) {

		EntityManager manager = fabrica.createEntityManager();
		Persona persona = (Persona)manager.find(Persona.class, 1);
		
		System.out.println(persona);

		
	
	}
	
}
