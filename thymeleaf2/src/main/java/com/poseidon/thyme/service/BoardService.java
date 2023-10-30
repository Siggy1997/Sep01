package com.poseidon.thyme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poseidon.thyme.dao.BoardDAO;
import com.poseidon.thyme.dto.BoardDTO;
import com.poseidon.thyme.dto.PageDTO;


@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList(PageDTO pageDTO) {
		return boardDAO.boardList(pageDTO);
	}

	public String detail(int bno) {
		return boardDAO.detail(bno);
	}
	
}
