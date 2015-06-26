package com.aludena.mtkweb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.mtkweb.dao.IfaceConsulta;
import com.aludena.mtkweb.dao.ImplConsulta;
import com.aludena.mtkweb.getset.DatosTramaGetSet;

/**
 * Servlet implementation class ConsultaServlet
 */
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServlet() {
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
		String accion = request.getParameter("accion");
		String imei = request.getParameter("imei");
		String fechaDesde = request.getParameter("datepicker");
		String fechaHasta = request.getParameter("datepicker2");
		
		fechaDesde = (fechaDesde.replace("/", "")+"000000").substring(2);
		fechaHasta = (fechaHasta.replace("/", "")+"000000").substring(2);
		
		System.out.println(fechaDesde);
		System.out.println(fechaHasta);
		
		if(accion.equals("consultar")){
			ArrayList<DatosTramaGetSet> lista = new ArrayList<DatosTramaGetSet>();
			
			IfaceConsulta ifconsulta = new ImplConsulta();
			lista = ifconsulta.consultaLista(imei, fechaDesde, fechaHasta);
			
			HttpSession sesion = request.getSession();
			sesion.setAttribute("listaDatos", lista);
			sesion.setAttribute("imei", imei);
			
			response.sendRedirect("mainPage.jsp");
		}
	}

}
