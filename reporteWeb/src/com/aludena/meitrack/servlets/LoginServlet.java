package com.aludena.meitrack.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.meitrack.servlets.vo.VOLogin;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		
		if (usuario.equals("aludena") && password.equals("1234")){
			//System.out.println("Bienvenido");
			
			VOLogin login = new VOLogin();
			login.setUsuario(usuario);
			login.setPassword(password);
			login.setNombre("Abel Ludeña Gutierrez");
			login.setEdad(30);
			
			HttpSession sesion = request.getSession();
			ArrayList<VOLogin> lista = new ArrayList<VOLogin>();
			
			sesion.setAttribute("usuarioLogeado", login);
			sesion.setAttribute("listaUsuario", lista);
			
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("login.html");
		}
	}

}
