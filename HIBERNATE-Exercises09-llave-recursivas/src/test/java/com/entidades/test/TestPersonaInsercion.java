package com.entidades.test;

import java.util.Date;
import java.util.Set;

import com.entidades.Direccion;
import com.entidades.Mascota;
import com.entidades.NombreCompleto;
import com.entidades.Persona;
import com.entidades.TipoMascota;
import com.persistencia.GestorPersistencia;

public class TestPersonaInsercion {

	public static void main(String[] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		
		NombreCompleto nombreCompleto = new NombreCompleto("Bryan", "Josue", "Solares", "Perez");
		Direccion direccion = new Direccion(1, "Calle A", "6-45", "2-22", "Toledo");
		Persona persona = new Persona(1, "Bryan Josue Solares", "Ciudad de Guatemala", new Date(), "8474438-3", 24,
				direccion, nombreCompleto);
		agregarMascota(persona);
		

		if (persistencia.insertarPersona(persona))
			System.out.println("Persona Insertada");
		else
			System.out.println("Ha fallado la inserci�n");

	}

	private static void agregarMascota(Persona persona){
		persona.getMascotas().add(new Mascota(1, "Pamfilo", TipoMascota.PERRO, persona));
		persona.getMascotas().add(new Mascota(2, "F�lix", TipoMascota.GATO, persona));
		persona.getMascotas().add(new Mascota(3, "Stuart", TipoMascota.HASMTER, persona));
	}
}
