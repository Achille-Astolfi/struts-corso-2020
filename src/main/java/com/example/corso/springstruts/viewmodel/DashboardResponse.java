package com.example.corso.springstruts.viewmodel;

import java.io.Serializable;

public class DashboardResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title;
	private String message;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
