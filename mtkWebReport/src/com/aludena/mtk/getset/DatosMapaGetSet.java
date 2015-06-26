package com.aludena.mtk.getset;

import java.io.Serializable;

public class DatosMapaGetSet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5097649380841638536L;
	private String latitud;
	private String longitud;
	private String timeDate;
	private String speed;
	
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getTimeDate() {
		return timeDate;
	}
	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	

}
