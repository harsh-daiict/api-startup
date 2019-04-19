package com.example.demo.enums;

public enum Message{
	NO_MESSAGE(null),
	INVALID_LOGIN_CREDENTIALS("Invalid Login Credentials");
	
	String msg;
	
	Message(String msg) {
		this.msg = msg;
	}
	
	public String getMsg(){
		return this.msg;
	}
}
