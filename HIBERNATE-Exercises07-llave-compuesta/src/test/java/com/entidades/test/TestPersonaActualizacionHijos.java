package com.entidades.test;

import com.entidades.Mascota;
import com.entidades.Persona;
import com.entidades.TipoMascota;
import com.persistencia.GestorPersistencia;

public class TestPersonaActualizacionHijos {

	public static void main(String[] args) {
		GestorPersistencia persistencia = new GestorPersistencia();
		Persona persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);
		
		persona.setNombre("Yojana Elizabeth Vicente Gomez");
		persona.getMascotas().add(new Mascota(4, "SNUPI", TipoMascota.TORTUGA, persona));
		
		if(persistencia.actualizarPersona(persona))
			System.out.println("Persona actualizada con éxito");
		else
			System.out.println("Error al actualizar persona");
		
		persona = persistencia.getPersonaPorId(1);
		System.out.println(persona);

	}

}
