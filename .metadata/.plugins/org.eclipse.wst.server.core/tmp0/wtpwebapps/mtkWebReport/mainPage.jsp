<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@page import="com.aludena.mtk.getset.DatosTramaGetSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="Estilos/Estilos.css">
	<script type="text/javascript">
		function consultar() {
			var formaMain = document.getElementById("formaMain");
			var accion = document.getElementById("accion");
			formaMain.action = "consultaServlet.alg";
			accion.value = "consulta";
			formaMain.submit();
		}
		function ubicar(latitud,longitud,timeDate,speed) {
			var formaMain = document.getElementById("formaMain");
			var lat = document.getElementById("lat");
			var lon = document.getElementById("lon");
			var tDate = document.getElementById("timeDate");
			var spd = document.getElementById("speed");
			formaMain.action = "ubicaMapaServlet.alg";
			lat.value = latitud;
			lon.value = longitud;
			tDate.value = timeDate;
			spd.value = speed;
			formaMain.submit();
		}
	</script>
</head>

<body>
	<form action="" method="post" id="formaMain" >
	<input type="hidden" name="accion" id="accion">
	
	<input type="hidden" name="lat" id="lat"> 
	<input type="hidden" name="lon" id="lon">
	<input type="hidden" name="timeDate" id="timeDate">
	<input type="hidden" name="speed" id="speed">
	
	<p>Bienvenido <%=session.getAttribute("datosLogin") %></p>
	<p align="center">
		IMEI : 
		<input type="text" name="imei" id="imei">
		<input type="button" value="Consultar" onclick="consultar()">
	</p>
	<table align="center">
		<tr>
			<th>IMEI</th>
			<th>NUMERO DE EVENTO</th>
			<th>LATITUD</th>
			<th>LONGITUD</th>
			<th>FECHA Y HORA</th>
			<th>VELOCIDAD</th>
			<th>MAPA</th>
		</tr>
		<%
		ArrayList<DatosTramaGetSet> lista = (ArrayList<DatosTramaGetSet>) session.getAttribute("listaDatosTrama");
		//System.out.println("mainPage.jsp : "+ lista);
		for(DatosTramaGetSet obj : lista){
		%>
			<tr>
				<td><%=obj.getImei()%></td>
				<td><%=obj.getEvent_code()%></td>
				<td><%=obj.getLatitude()%></td>
				<td><%=obj.getLongitude()%></td>
				<td><%=obj.getFecha_hora()%></td>
				<td><%=obj.getVelocidad()%></td>
				<td><a onclick="ubicar(<%=obj.getLatitude()%>,<%=obj.getLongitude()%>,<%=obj.getFecha_hora()%>,<%=obj.getVelocidad()%>)">Ver Mapa</a></td>
			</tr>	
		<%
		}
		%>
	</table>
	</form>
</body>
</html>