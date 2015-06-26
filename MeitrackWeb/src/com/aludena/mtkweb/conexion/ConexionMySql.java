package com.aludena.mtkweb.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://172.16.1.48:3306/meitrack";
	String user = "abel";
	String password = "1234";
	
	public Connection obtenConexion(){
		Connection conexion = null;
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}
}
