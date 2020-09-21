package com.example.corso.springstruts.actions;

import com.example.corso.springstruts.viewmodel.SumResponse;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SumAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private SumResponse sumResponse = new SumResponse();

	@Override
	public String execute() throws Exception {
		sumResponse.setLeft(17);
		sumResponse.setRight(49);
		sumResponse.setSum(17 + 49);
		return Action.SUCCESS;
	}

	public SumResponse getSumResponse() {
		return sumResponse;
	}

}
