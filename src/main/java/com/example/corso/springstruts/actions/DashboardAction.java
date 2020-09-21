package com.example.corso.springstruts.actions;

import javax.inject.Inject;

import com.example.corso.springstruts.service.MessageService;
import com.example.corso.springstruts.viewmodel.DashboardResponse;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DashboardAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Inject
	private MessageService messageService;

	private DashboardResponse dashboardResponse = new DashboardResponse();

	@Override
	public String execute() throws Exception {
		dashboardResponse.setTitle(messageService.dashboard());
		dashboardResponse.setMessage("Ecco il tuo cruscotto.");
		return Action.SUCCESS;
	}

	public DashboardResponse getDashboardResponse() {
		return dashboardResponse;
	}

}
