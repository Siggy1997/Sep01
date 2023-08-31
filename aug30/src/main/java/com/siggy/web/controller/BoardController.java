package com.siggy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siggy.web.dto.BoardDTO;
import com.siggy.web.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//pageNo
	@GetMapping("/board")
	public String board(@RequestParam(name="pageNo", required = false, defaultValue = "1") int pageNo,  Model model) {
		
		//pageNo === (pageNo-1) *10
		List<BoardDTO> list = boardService.list((pageNo-1) *10);
		model.addAttribute("list", list); 
		
		return "/board";
	}
	
	
	@GetMapping("/detail")
	public String detail(@RequestParam("bno") int bno, Model model) {
		BoardDTO detail = boardService.detail(bno);
		model.addAttribute("detail", detail);
		return "/detail";
	}
}
