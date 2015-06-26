<%@page import="com.aludena.meitrack.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Bienvenido al aplicativo web Meitrack Report 
	<%= ((VOLogin)session.getAttribute("usuarioLogeado")).getNombre()%>
	</p>
	
	<a href="usuarios/usuarios.jsp">Lista de Usuarios</a>
</body>
</html>