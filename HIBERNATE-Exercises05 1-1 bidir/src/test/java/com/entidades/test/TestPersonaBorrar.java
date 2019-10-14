package com.entidades.test;

import com.entidades.Persona;
import com.persistencia.GestorPersistencia;

public class TestPersonaBorrar {

	public static void main(String[] args) {
		GestorPersistencia persistencia = new GestorPersistencia();
		Persona persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);
		
		if(persistencia.eliminarPersona(persona))
			System.out.println("Persona eliminada con éxito");
		else
			System.out.println("Error al eliminar persona");
		
		persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);

	}

}
