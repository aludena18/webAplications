package com.aludena.mtk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aludena.mtk.getset.DatosMapaGetSet;

/**
 * Servlet implementation class UbicaMapServlet
 */
public class UbicaMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UbicaMapServlet() {
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
		String timeDate = request.getParameter("timeDate");
		String speed = request.getParameter("speed");
		
		System.out.println("GPS = " + lat + " : " + lon + " : " + timeDate + " :" + speed);
		
		DatosMapaGetSet datosMapa = new DatosMapaGetSet();
		datosMapa.setLatitud(lat);
		datosMapa.setLongitud(lon);
		datosMapa.setTimeDate(timeDate);
		datosMapa.setSpeed(speed);
		
		HttpSession sesion = request.getSession();
		
		sesion.setAttribute("paraMapa", datosMapa);
		
		response.sendRedirect("mapa.jsp");
	}

}
