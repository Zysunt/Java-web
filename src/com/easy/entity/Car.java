package com.easy.entity;

import org.springframework.web.multipart.MultipartFile;

public class Car {
	private int idCar;
	private int B_id;
	private String Bname;
	private int L_id;
	private String Lname;
	private String type;
	private String structure;
	private String output;
	private String gearbox;
	private int seat;
	private String original;
	private String discount;
	private String image;
	private MultipartFile file;
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public int getL_id() {
		return L_id;
	}
	public void setL_id(int l_id) {
		L_id = l_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int idCar, int b_id, String bname, int l_id, String lname, String type, String structure, String output,
			String gearbox, int seat, String original, String discount, String image) {
		super();
		this.idCar = idCar;
		B_id = b_id;
		Bname = bname;
		L_id = l_id;
		Lname = lname;
		this.type = type;
		this.structure = structure;
		this.output = output;
		this.gearbox = gearbox;
		this.seat = seat;
		this.original = original;
		this.discount = discount;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Car [idCar=" + idCar + ", B_id=" + B_id + ", Bname=" + Bname + ", L_id=" + L_id + ", Lname=" + Lname
				+ ", type=" + type + ", structure=" + structure + ", output=" + output + ", gearbox=" + gearbox
				+ ", seat=" + seat + ", original=" + original + ", discount=" + discount + ", image=" + image + "]";
	}
	
}
