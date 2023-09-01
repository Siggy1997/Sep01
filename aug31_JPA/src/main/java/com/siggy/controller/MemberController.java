package com.siggy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.siggy.entity.Member;
import com.siggy.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	


	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Member member, HttpSession session) {
		Member result = memberService.findByMidAndMpw(member.getMid(),member.getMpw());
		
		int count = memberService.count(member);
		System.out.println("COUNT" + count);
		
		if(count==1) {
			session.setAttribute("mid", member.getMid());
			session.setAttribute("mname", result.getMname());
			return "redirect:/index";
		}
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
}
