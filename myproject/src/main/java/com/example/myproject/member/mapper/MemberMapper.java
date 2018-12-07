package com.example.myproject.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myproject.member.vo.MemberVo;

@Mapper
public interface MemberMapper {
	List<MemberVo> selectMemberAll();
}
