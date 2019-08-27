package com.spring.jsf.application.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "user")
public class User {
	private String id;
	private String userName;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin() {
		if(this.userName.equals("burakerken"))
			if(this.password.equals("h12w3")) {
				System.out.println("succes");
			}
	}
	
	
}
