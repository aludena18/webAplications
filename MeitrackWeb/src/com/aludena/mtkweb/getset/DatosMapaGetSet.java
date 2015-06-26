package com.aludena.mtkweb.getset;

import java.io.Serializable;

public class DatosMapaGetSet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8654614425995265239L;
	private String latMap;
	private String lonMap;
	private String fecMap;
	private String velMap;
	
	public String getLatMap() {
		return latMap;
	}
	public void setLatMap(String latMap) {
		this.latMap = latMap;
	}
	public String getLonMap() {
		return lonMap;
	}
	public void setLonMap(String lonMap) {
		this.lonMap = lonMap;
	}
	public String getFecMap() {
		return fecMap;
	}
	public void setFecMap(String fecMap) {
		this.fecMap = fecMap;
	}
	public String getVelMap() {
		return velMap;
	}
	public void setVelMap(String velMap) {
		this.velMap = velMap;
	}
	
	
}
