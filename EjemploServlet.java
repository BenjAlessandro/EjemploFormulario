package ejemplo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import java.io.PrintWriter;

@WebServlet("/EjemploServlet")
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EjemploServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// GET
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre");
		out.println(" Hola tu nombre es " + nombre + ". Saludos!!!");
	}

	/* La diferencia entre Post y Get es que: en get muestra la ruta completa y exacta de la página, 
	en cambio con post la ruta no le aparece al usuario */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// POST
	}

}
