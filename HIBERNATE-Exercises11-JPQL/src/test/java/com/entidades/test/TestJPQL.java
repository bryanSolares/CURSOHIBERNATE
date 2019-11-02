package com.entidades.test;

import java.util.List;

import com.entidades.Mascota;
import com.entidades.Persona;
import com.entidades.TipoMascota;
import com.persistencia.GestorPersistencia;

public class TestJPQL {

	public static void main(String[] args) {
		GestorPersistencia persistencia = new GestorPersistencia();
		//List<Mascota> lista = persistencia.getMascotasTodas();
		//List<Mascota> lista = persistencia.getMascotasTodasGatos();
		//List<Mascota> lista = persistencia.getMascotasPorTipo(TipoMascota.HASMTER);
		//List<Persona> lista = persistencia.getPersonaConMascota();
		List<Persona> lista = persistencia.getPersonaConMascotaconTipo(TipoMascota.HASMTER);
		lista.forEach(p ->
				System.out.println(p.getNombreCompleto()));
		
		System.out.println("Las mascotas Son: ");
		lista.forEach(p -> System.out.println(p.getMascotas()));
		persistencia.cerrar();
	}

}
