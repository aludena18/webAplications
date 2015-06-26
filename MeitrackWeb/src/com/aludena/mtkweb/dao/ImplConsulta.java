package com.aludena.mtkweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aludena.mtkweb.conexion.ConexionSqlVps;
import com.aludena.mtkweb.getset.DatosTramaGetSet;

public class ImplConsulta implements IfaceConsulta{
	String query = "select imei,command_code,event_code,latitude," +
					"longitude,time_date,gps_status,num_satelites," +
					"gsm_signal,speed,heading,hdop,altitude," +
					"mileage,runtime from report ";
	
	@Override
	public ArrayList<DatosTramaGetSet> consultaLista(String i, String fd, String fh) {
		String imei = i;
		String fechaDesde = fd;
		String fechaHasta = fh;
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sb = null;
		ArrayList<DatosTramaGetSet> lista = null;
		DatosTramaGetSet datos = null;
		
		try {
			conexion = new ConexionSqlVps().getconexion();
			query = query + "where imei='" + imei + 
							//"' and time_date between '" + fechaDesde + 
							//"' and '" + fechaHasta + 
							"' order by id desc";
			System.out.println(query);
			sb = new StringBuilder().append(query);
			ps = conexion.prepareStatement(sb.toString());
			rs = ps.executeQuery();
			
			lista = new ArrayList<DatosTramaGetSet>();
			
			while(rs.next()){
				datos = new DatosTramaGetSet();
				datos.setImei(rs.getString("imei"));
				datos.setComando(rs.getString("command_code"));
				datos.setEvento(rs.getString("event_code"));
				datos.setLatitud(rs.getString("latitude"));
				datos.setLongitud(rs.getString("longitude"));
				datos.setFecha(rs.getString("time_date"));
				datos.setGps(rs.getString("gps_status"));
				datos.setSatelites(rs.getString("num_satelites"));
				datos.setGsm(rs.getString("gsm_signal"));
				datos.setVelocidad(rs.getString("speed"));
				datos.setHeading(rs.getString("heading"));
				datos.setHdop(rs.getString("hdop"));
				datos.setAltitud(rs.getString("altitude"));
				datos.setOdometro(rs.getString("mileage"));
				datos.setHorometro(rs.getString("runtime"));
				
				lista.add(datos);
			}
			
			rs.close();
			ps.close();
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
	}

}
