package web;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controladores.GestorPersistencia;
import entidades.Persona;

@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestorPersistencia gestorPersistencia;

	public Controlador() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		gestorPersistencia = new GestorPersistencia();
	}

	@Override
	public void destroy() {
		gestorPersistencia.cerrarRecursos();
		// super.destroy();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		sesion.removeAttribute("mensaje");
		sesion.removeAttribute("persona");

		if (request.getParameterMap().isEmpty()) {
			response.sendRedirect("getId.jsp");
			return;
		}

		String idRequerido = request.getParameter("idPersona");
		if (idRequerido.isEmpty()) {
			sesion.setAttribute("mensaje", "El id de la persona es necesario!");
			response.sendRedirect("getId.jsp");
			return;
		}

		int id = 0;
		try {
			id = Integer.parseInt(idRequerido);
		} catch (NumberFormatException e) {
			sesion.setAttribute("mensaje", "El id de la persona debe ser num&eacute;rico");
			response.sendRedirect("getId.jsp");
			return;
		}

		Persona persona = gestorPersistencia.obtenerPersona(id);
		if (persona != null) {
			sesion.setAttribute("persona", persona);
			response.sendRedirect("Persona.jsp");
		} else {
			sesion.setAttribute("mensaje", "No existe una persona con ese Id en la base de datos");
			response.sendRedirect("getId.jsp");
			return;
		}

	}

}
