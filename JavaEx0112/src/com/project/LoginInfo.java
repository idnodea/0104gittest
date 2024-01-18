package com.project;

public class LoginInfo {
	String id;
	String pass;
	
	
	
	public LoginInfo(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	
	

	@Override
	public String toString() {
		return "LoginInfo [id=" + id + ", pass=" + pass + "]";
	}
	
}
