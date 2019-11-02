package com.entidades.test;

import java.util.List;

import com.entidades.Mascota;
import com.entidades.Persona;
import com.persistencia.GestorPersistencia;

public class TestCriteria {
	
	
	
	public static void main (String [] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		//List<Mascota> lista = persistencia.getCriteriaMascotasTodas();
		//List<String> lista = persistencia.getCriteriaMascotasNombres();
		//List<Mascota> lista = persistencia.getCriteriaGatosTodos();
		List<Persona> lista = persistencia.getCriteriaPersonasConGatos();
		
		lista.forEach(System.out::println);
	}
	
}
