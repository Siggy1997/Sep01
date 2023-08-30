package com.siggy.web.dto;

import lombok.Data;

@Data
public class LoginDTO {
	private int count;
	private String m_id, m_pw, m_name;
}
