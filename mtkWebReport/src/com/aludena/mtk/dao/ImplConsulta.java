package com.aludena.mtk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aludena.mtk.conection.ConexionBD;
import com.aludena.mtk.getset.DatosTramaGetSet;

public class ImplConsulta implements IfaceConsulta{

	@Override
	public ArrayList<DatosTramaGetSet> consultaListaDatos() {
		
		ArrayList<DatosTramaGetSet> lista = null;
		DatosTramaGetSet datosGS = null;
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conexion = new ConexionBD().getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("select IMEI, EVENT_CODE,LATITUDE,LONGITUDE,FECHA_HORA,SPEED from REPORTE");
			ps = conexion.prepareStatement(sb.toString());
			rs = ps.executeQuery();
			lista = new ArrayList<DatosTramaGetSet>();
			
			while(rs.next()){
				datosGS = new DatosTramaGetSet();
				datosGS.setImei(rs.getString("IMEI")); 				//System.out.println(rs.getString("IMEI"));
				datosGS.setEvent_code(rs.getString("EVENT_CODE")); 	//System.out.println(rs.getString("EVENT_CODE"));
				datosGS.setLatitude(rs.getString("LATITUDE")); 		//System.out.println(rs.getString("LATITUDE"));
				datosGS.setLongitude(rs.getString("LONGITUDE"));	//System.out.println(rs.getString("LONGITUDE"));
				datosGS.setFecha_hora(rs.getString("FECHA_HORA"));	//System.out.println(rs.getString("FECHA_HORA"));
				datosGS.setVelocidad(rs.getString("SPEED")); 		//System.out.println(rs.getString("SPEED"));
				lista.add(datosGS);	
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
