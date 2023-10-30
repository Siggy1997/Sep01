package com.poseidon.thyme.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("text", "컨트롤러에서 보내온 메시지");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {			
			list.add("홍길동"+i);
		}
		model.addAttribute("list", list);
		return "index.html";
	}
	
	@GetMapping("/login")
	public String login(HttpSession session) {
		session.setAttribute("mid", "poseidon");
		return "redirect:/";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main.html";
	}
	
}