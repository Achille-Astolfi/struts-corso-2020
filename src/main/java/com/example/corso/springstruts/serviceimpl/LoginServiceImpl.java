package com.example.corso.springstruts.serviceimpl;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.corso.springstruts.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Override
	public String login(String username, String password) {
		if (!Objects.equals(password, "nttdata0") || !StringUtils.hasText(username)) {
			return null;
		} else {
			username = username.trim();
			int dot = username.indexOf('.');
			if (dot <= 0) {
				return username;
			} else {
				return username.substring(0, dot);
			}
		}
	}
}
