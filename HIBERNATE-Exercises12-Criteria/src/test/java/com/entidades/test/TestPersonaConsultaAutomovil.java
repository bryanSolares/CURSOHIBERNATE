package com.entidades.test;

import com.entidades.Automovil;
import com.entidades.AutomovilPK;
import com.persistencia.GestorPersistencia;

public class TestPersonaConsultaAutomovil {

	
	
	public static void main (String [] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		Automovil automovil = persistencia.getAutomivilPorId(new AutomovilPK("M-293843", "GTM"));	
		System.out.println(automovil);
		automovil.getPatrocinadores().forEach(System.out::println);
		persistencia.cerrar(); 
	}
	
}
