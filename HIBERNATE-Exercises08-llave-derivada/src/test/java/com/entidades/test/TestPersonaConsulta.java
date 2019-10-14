package com.entidades.test;

import com.entidades.Persona;
import com.persistencia.GestorPersistencia;

public class TestPersonaConsulta {

	
	
	public static void main (String [] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		Persona persona = persistencia.getPersonaPorId(1);	
		System.out.println(persona);
		persistencia.cerrar(); 
	}
	
}
