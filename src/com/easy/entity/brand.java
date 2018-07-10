package com.easy.entity;

public class brand {
	private int idBrand;
	private String Bname;
	@Override
	public String toString() {
		return "brand [idBrand=" + idBrand + ", Bname=" + Bname + "]";
	}
	public int getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	
}
