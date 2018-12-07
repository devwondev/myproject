package com.example.myproject.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myproject.member.vo.MemberVo;
import com.exapmle.myproject.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping(value="/listMember", method=RequestMethod.GET)
	public String memberList(Model model) {
		System.out.println("MemberController.memberList() 호출");
		List<MemberVo> memberList = memberService.getMemberAll();
		model.addAttribute("memberList", memberList);
		return "listMember";
	}
}
