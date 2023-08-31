package com.siggy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.siggy.web.Member;
import com.siggy.web.repository.MemberRepository;

@Controller
public class MemberController { 
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/members")
	public String memebers(Model model) {
//		Member member = new Member();
//		member.setM_id("Siggy");
//		member.setM_name("시기");
//		member.setM_pw("123456");
//		member.setM_joindate("2023-08-31");
//		
//		memberRepository.save(member);
		
		
		
//		List<Member> list = memberRepository.findAll();
		List<Member> list = memberRepository.findTop5ByOrderByMno();
		
		
		model.addAttribute("list", list);
		/*
		 * findAll()	전체 가져오기
		 * findOne()	하나 가져오기
		 * save()		저장하기 / 수정하기
		 * count()		 
		 * delete()
		 */
		
		
		
		
		
		return "/members";
	}
}
