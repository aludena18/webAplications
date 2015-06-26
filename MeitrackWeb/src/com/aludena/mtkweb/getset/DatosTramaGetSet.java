package com.aludena.mtkweb.getset;

import java.io.Serializable;

public class DatosTramaGetSet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4048811335043026497L;
	private String imei;
	private String comando;
	private String evento;
	private String latitud;
	private String longitud;
	private String fecha;
	private String gps;
	private String satelites;
	private String gsm;
	private String velocidad;
	private String heading;
	private String hdop;
	private String altitud;
	private String odometro;
	private String horometro;
	
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getComando() {
		return comando;
	}
	public void setComando(String comando) {
		this.comando = comando;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	public String getSatelites() {
		return satelites;
	}
	public void setSatelites(String satelites) {
		this.satelites = satelites;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getHdop() {
		return hdop;
	}
	public void setHdop(String hdop) {
		this.hdop = hdop;
	}
	public String getAltitud() {
		return altitud;
	}
	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}
	public String getOdometro() {
		return odometro;
	}
	public void setOdometro(String odometro) {
		this.odometro = odometro;
	}
	public String getHorometro() {
		return horometro;
	}
	public void setHorometro(String horometro) {
		this.horometro = horometro;
	}
	
}
