package com.siggy.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.siggy.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);



}
