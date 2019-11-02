package com.entidades.test;

import com.entidades.Empleado;
import com.persistencia.GestorPersistencia;

public class TestEmpleadoInsercion {

	public static void main(String[] args) {
		GestorPersistencia persistencia = new GestorPersistencia();
		Empleado emp = new Empleado("Bryan Solares", "Jefe Informática");
		persistencia.insertarEmpleado(emp);
		System.out.println(emp.getNumEmpleado());
		persistencia.cerrar();

	}

}
