package com.entidades.test;

import com.entidades.LugarEstacionamiento;
import com.persistencia.GestorPersistencia;

public class TestPersonaConsultaEstacionamiento {

	
	
	public static void main (String [] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		LugarEstacionamiento estacionamiento = persistencia.getEstacionamientoPorId(1);	
		System.out.println(estacionamiento);
		persistencia.cerrar(); 
	}
	
}
