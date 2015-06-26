package com.aludena.meitrack.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.aludena.meitrack.servlets.vo.VOLogin;

/**
 * Servlet implementation class UsuariosServlet
 */
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		System.out.println(accion);
		
		HttpSession sesion = request.getSession();
		ArrayList<VOLogin> lista = (ArrayList<VOLogin>)sesion.getAttribute("listaUsuario");
		
		VOLogin login = new VOLogin();
		login.setUsuario(request.getParameter("usuario"));
		login.setPassword(request.getParameter("password"));
		login.setNombre(request.getParameter("nombre"));
		login.setEdad(Integer.parseInt(request.getParameter("edad")));
		
		if(accion.equals("guardar")){
			lista.add(login);
		}else if(accion.equals("actualizar")){
			
		}else if(accion.equals("borrar")){
			
		}
		response.sendRedirect("usuarios.jsp");
	}

}
