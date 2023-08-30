package com.siggy.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("txt", "서버MSG");
		model.addAttribute("html", "<h1>hello</h1>");
		model.addAttribute("bno", 255);
		List<String> list = new ArrayList<String>();
		for (int j = 0; j < 10; j++) {
			list.add("홍길동 " +j );
			
		}
		model.addAttribute("list", list);
		return "index.html";
	}
}
