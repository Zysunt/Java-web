package com.easy.entity;

public class Level {
	private int idLevel;
	private String Lname;
	public int getIdLevel() {
		return idLevel;
	}
	public void setIdLevel(int idLevel) {
		this.idLevel = idLevel;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Level [idLevel=" + idLevel + ", Lname=" + Lname + "]";
	}
	
	
	
}
