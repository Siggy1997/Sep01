package com.siggy.web.repository;

import org.springframework.data.repository.Repository;

import com.siggy.web.JBoard;

public interface BoardRepository extends Repository<JBoard, Long> {

	void save(JBoard jBoard);

}
