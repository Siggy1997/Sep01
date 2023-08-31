package com.siggy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.siggy.web.dto.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> list(int pageNo);

	BoardDTO detail(int bno);

}
