package com.aludena.mtk.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.mtk.dao.IfaceConsulta;
import com.aludena.mtk.dao.ImplConsulta;
import com.aludena.mtk.getset.DatosTramaGetSet;

/**
 * Servlet implementation class ConsultaServlet
 */
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServlet() {
        //super();
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
		
		if(accion.equals("consulta")){
			HttpSession sesion = request.getSession();
			
			ArrayList<DatosTramaGetSet> ifaceLista = new ArrayList<DatosTramaGetSet>();
			IfaceConsulta ifConsulta = new ImplConsulta();
			ifaceLista = ifConsulta.consultaListaDatos();
			
			request.getSession().setAttribute("listaDatosTrama",ifaceLista);
			
			response.sendRedirect("mainPage.jsp");
		}
		
		
	}
}
