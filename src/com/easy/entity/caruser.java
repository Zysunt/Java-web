package com.easy.entity;

public class caruser {
	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public caruser(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public caruser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "caruser [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}
