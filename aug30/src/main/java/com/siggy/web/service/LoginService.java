package com.siggy.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siggy.web.dao.LoginDAO;
import com.siggy.web.dto.LoginDTO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;

	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);
	}


}
