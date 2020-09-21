package com.example.corso.springstruts.actions;

import com.example.corso.springstruts.viewmodel.LoginForm;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private LoginForm loginForm;

	@Override
	public String execute() {
		if (loginForm == null) {
			loginForm = new LoginForm();
			return Action.INPUT;
		} else {
			return Action.SUCCESS;
		}
	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}
}
