package com.poseidon.thyme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.poseidon.thyme.dto.BoardDTO;
import com.poseidon.thyme.dto.PageDTO;


@Repository
@Mapper
public interface BoardDAO {

	List<BoardDTO> boardList(PageDTO pageDTO);

	String detail(int bno);

}
