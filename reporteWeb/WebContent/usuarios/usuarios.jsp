<%@page import="java.util.ArrayList"%>
<%@page import="com.aludena.meitrack.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<script type="text/javascript">
		function guardar() {
			var forma = document.getElementById("formaUsuarios");
			var accion = document.getElementById("accion");
			forma.action = "userServlet.alg";
			accion.value = "guardar";
			forma.submit();
		}
		function actualizar() {
			var forma = document.getElementById("formaUsuarios");
			var accion = document.getElementById("accion");
			forma.action = "userServlet.alg";
			accion.value = "actualizar";
			forma.submit();
		}
		function borrar() {
			var forma = document.getElementById("formaUsuarios");
			var accion = document.getElementById("accion");
			forma.action = "userServlet.alg";
			accion.value = "borrar";
			forma.submit();
		}
	</script>
</head>
<body>
	<form action="" method="post" id="formaUsuarios">
	<input type="hidden" name="accion" id="accion">
	<p>Usuarios <%= ((VOLogin)session.getAttribute("usuarioLogeado")).getNombre()%></p>

		<table>
			<tr>
				<td>Usuario :</td>
				<td><input type="text" name="usuario" id="usuario"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td>Nombre :</td>
				<td><input type="text" name="nombre" id="nombre"></td>
			</tr>
			<tr>
				<td>Edad :</td>
				<td><input type="text" name="edad" id="edad"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="Guardar" onclick="guardar()">
					<input type="button" value="Actualizar" onclick="actualizar()">
					<input type="button" value="Eliminar" onclick="borrar()">
				</td>
			</tr>
			
		</table>

		<table>
			<tr>
				<th>Usuarios</th>
				<th>Nombre(s)</th>
				<th>Edad</th>
			</tr>
			<%
				ArrayList<VOLogin> lista = (ArrayList<VOLogin>) session.getAttribute("listaUsuario");
				for (VOLogin obj : lista) {
			%>
			<tr>
				<td><%=obj.getUsuario()%></td>
				<td><%=obj.getNombre()%></td>
				<td><%=obj.getEdad()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</form>
</body>
</html>