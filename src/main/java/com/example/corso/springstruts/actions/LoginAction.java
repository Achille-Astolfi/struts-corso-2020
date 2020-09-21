package com.example.corso.springstruts.actions;

import javax.inject.Inject;

import org.springframework.util.StringUtils;

import com.example.corso.springstruts.service.LoginService;
import com.example.corso.springstruts.viewmodel.LoginForm;
import com.example.corso.springstruts.viewmodel.LoginResponse;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LoginService loginService;

	private LoginForm loginForm;
	private LoginResponse loginResponse = new LoginResponse();

	@Override
	public String execute() {
		if (loginForm == null) {
			loginForm = new LoginForm();
			loginForm.setRememberMe(true);
			return Action.INPUT;
		} else {
			String name = loginService.login(loginForm.getEmailAddress(), loginForm.getPassword());
			if (name != null) {
				loginResponse.setName(name);
				return Action.SUCCESS;
			} else {
				// devo tornare a digitare username e password
				this.addFieldError("loginForm.emailAddress", "Utente non identificato; riprova.");
				return Action.INPUT;
			}
		}
	}

	@Override
	public void validate() {
		if (!StringUtils.hasText(loginForm.getEmailAddress())) {
			this.addFieldError("loginForm.emailAddress", "Digita la tua username.");
		}
		if (!StringUtils.hasLength(loginForm.getPassword())) {
			this.addFieldError("loginForm.password", "Digita la tua password.");
		}
	}

	public LoginForm getLoginForm() {
		return loginForm;
	}

	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}

	public LoginResponse getLoginResponse() {
		return loginResponse;
	}
}
