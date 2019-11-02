package com.entidades.test;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.transform.ToListResultTransformer;

import com.entidades.AreaGeografica;
import com.entidades.Persona;
import com.persistencia.GestorPersistencia;

public class TestAreaConsulta {

	private static GestorPersistencia persis = new GestorPersistencia(); 
	
	public static void main(String[] args) {

		GestorPersistencia persistencia = new GestorPersistencia();
		AreaGeografica area = persistencia.getAreaPorId("GTM");
		
		System.out.println("******Padres******");
		List<AreaGeografica> listaDeptos = area.getAreasHijo();
		listaDeptos.forEach(System.out::println);
		
		System.out.println("******Hijos******");
		List<AreaGeografica> listaMunicipios = regresaHijos(listaDeptos);
		listaMunicipios.forEach(System.out::println);

		System.out.println("******Nietos******");
		List<AreaGeografica> listaPueblos = regresaHijos(listaMunicipios);
		listaPueblos.forEach(System.out::println);

		persistencia.cerrar();
	}
	
	 static List<AreaGeografica> regresaHijos(List<AreaGeografica> padre){
		 return  padre.stream()
				.map(f -> persis.getAreaPorId(f.getCvArea()).getAreasHijo()).iterator().next();
	}

}
