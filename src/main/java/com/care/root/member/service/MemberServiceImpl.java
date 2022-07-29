package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired MemberMapper mapper;
	
	public int user_check(HttpServletRequest request) {
		MemberDTO dto = mapper.getUser(request.getParameter("id"));
		if(dto != null) {
			//=> 해당하는 아이디가 존재한다면
			if(dto.getPw().contentEquals(request.getParameter("pw"))) {
				return 0;
			}
		}
		return 1;
	}
	
	public ArrayList<MemberDTO> list(MemberDTO dto) {
		ArrayList<MemberDTO> list = mapper.list();
		
		return list;
	}



}
