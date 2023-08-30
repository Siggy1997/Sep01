package com.siggy.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.siggy.web.dto.LoginDTO;
import com.siggy.web.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	

	@GetMapping("/login")
	public String login() {

		return "/login";
	}

	@PostMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println(dto);
		LoginDTO result = loginService.login(dto);
		if (result.getCount()==1) {
			
			session.setAttribute("m_id", result.getM_id());
			session.setAttribute("m_pw", result.getM_pw());
			session.setAttribute("m_name", result.getM_name());
			
			return "redirect:/board";
		}else {
			
			return "/login";
		}
		
	}
}
