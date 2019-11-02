package Controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Persona;

public class GestorPersistencia {

	private EntityManagerFactory fabrica;
	private EntityManager manager;
	
	public GestorPersistencia(){
		fabrica = Persistence.createEntityManagerFactory("miControlador");
	}
	
	public Persona obtenerPersona(int idSolicitado) {
		Persona persona = null;
		manager = fabrica.createEntityManager();
		persona = manager.find(Persona.class, idSolicitado);
		manager.close();
		return persona;
	}
	
	public void cerrarRecursos() {
		fabrica.close();
	}
	
}
