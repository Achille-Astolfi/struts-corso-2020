package com.example.corso.springstruts.viewmodel;

import java.io.Serializable;

public class LoginForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailAddress;
	private String password;
	private boolean rememberMe;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
}
