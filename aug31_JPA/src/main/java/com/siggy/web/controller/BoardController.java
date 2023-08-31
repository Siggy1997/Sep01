package com.siggy.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siggy.web.JBoard;
import com.siggy.web.repository.BoardRepository;

@Controller
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepository;
	@GetMapping("/write")
	public String write() {
		return "/write";
		
	}
	
	@PostMapping("/write")
	public String write(JBoard jBoard) {
		
		System.out.println(jBoard);
		
		jBoard.setMname("뽀로롱");
		boardRepository.save(jBoard);
		
		return "redirect:/board";
	}


}
