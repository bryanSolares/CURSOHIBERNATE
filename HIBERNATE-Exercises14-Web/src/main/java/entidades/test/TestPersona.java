package entidades.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Controladores.GestorPersistencia;
import entidades.Persona;

public class TestPersona {

	public static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("miControlador");
	
	public static void main (String [] args) {

		//EntityManager manager = fabrica.createEntityManager();
		GestorPersistencia gestor = new GestorPersistencia();
		Persona persona = gestor.obtenerPersona(1);
		
		System.out.println(persona);

		
	
	}
	
}
