package com.example.corso.springstruts.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.corso.springstruts.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Override
	public String dashboard() {
		return "Dashboard";
	}
}
