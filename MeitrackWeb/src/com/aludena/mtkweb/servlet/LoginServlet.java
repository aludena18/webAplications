package com.aludena.mtkweb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.mtkweb.getset.DatosTramaGetSet;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
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
		System.out.println(usuario + ":" + password);
		
		if(usuario.equals("aludena") && password.equals("1234")){
			String imei = "";
			ArrayList<DatosTramaGetSet> lista = new ArrayList<DatosTramaGetSet>();
			HttpSession sesion = request.getSession();
			sesion.setAttribute("listaDatos", lista);
			sesion.setAttribute("imei", imei);
			
			response.sendRedirect("mainPage.jsp");
		}
		else response.sendRedirect("login.html");
	}

}
