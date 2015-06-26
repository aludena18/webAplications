package com.aludena.mtk.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQLBD {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://172.16.1.48:3306/meitrack";
	String user = "abel";
	String password = "1234";
	Connection conexionDB = null;
	
	public Connection getConnection(){
		try {
			Class.forName(driver);
			conexionDB = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexionDB;
	}
}
