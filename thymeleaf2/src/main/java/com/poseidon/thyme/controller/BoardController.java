package com.poseidon.thyme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poseidon.thyme.dto.BoardDTO;
import com.poseidon.thyme.dto.PageDTO;
import com.poseidon.thyme.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/board")
	public String board(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo, Model model) {
		PageDTO pageDTO = new PageDTO();
		pageDTO.setStart((pageNo - 1) * 10);
		pageDTO.setEnd(10);
		List<BoardDTO> list = boardService.boardList(pageDTO);
		// System.out.println(list);
		model.addAttribute("list", list);
		return "board";
	}
}
