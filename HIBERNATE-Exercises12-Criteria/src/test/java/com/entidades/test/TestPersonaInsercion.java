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
		Direccion direccion = new Direccion(3, "Calle A", "6-45", "2-22", "Toledo");
		Persona persona = new Persona(3, "33 33 33", "Ciudad de Guatemala", new Date(), "847443834-3", 24,
				direccion, nombreCompleto);
		agregarMascota(persona);
		

		if (persistencia.insertarPersona(persona))
			System.out.println("Persona Insertada");
		else
			System.out.println("Ha fallado la inserción");

	}

	private static void agregarMascota(Persona persona){
		persona.getMascotas().add(new Mascota(7, "7", TipoMascota.PERRO, persona));
		persona.getMascotas().add(new Mascota(8, "8", TipoMascota.GATO, persona));
		persona.getMascotas().add(new Mascota(9, "9", TipoMascota.HASMTER, persona));
	}
}
