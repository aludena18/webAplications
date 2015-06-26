package com.aludena.mtkweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.mtkweb.getset.DatosMapaGetSet;

/**
 * Servlet implementation class MapaServlet
 */
public class MapaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapaServlet() {
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
		String lat = request.getParameter("lat");
		String lon = request.getParameter("lon");
		String fec = request.getParameter("fec");
		String vel = request.getParameter("vel");
		
		DatosMapaGetSet datosMapa = new DatosMapaGetSet();
		datosMapa.setLatMap(lat);
		datosMapa.setLonMap(lon);
		datosMapa.setFecMap(fec);
		datosMapa.setVelMap(vel);
		
		HttpSession sesion = request.getSession();
		sesion.setAttribute("GoogleMaps", datosMapa);
		
		response.sendRedirect("mapa.jsp");
	}

}
