package com.entidades.test;

import com.entidades.Persona;
import com.persistencia.GestorPersistencia;

public class TestPersonaActualizacion {

	public static void main(String[] args) {
		GestorPersistencia persistencia = new GestorPersistencia();
		Persona persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);
		
		persona.setNombre("Yojana Elizabeth Vicente Gomez");
		
		if(persistencia.actualizarPersona(persona))
			System.out.println("Persona actualizada con éxito");
		else
			System.out.println("Error al actualizar persona");
		
		persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);

	}

}
