package com.exapmle.myproject.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.member.mapper.MemberMapper;
import com.example.myproject.member.vo.MemberVo;

@Service
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	/* 1. select*/
	public List<MemberVo> getMemberAll(){
		System.out.println("MemberService.getMemberAll() 호출");
		List<MemberVo> memberList = memberMapper.selectMemberAll();
		return memberList;
	}
}
