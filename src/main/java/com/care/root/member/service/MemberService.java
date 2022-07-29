package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int user_check(HttpServletRequest request);
	public ArrayList<MemberDTO> list();
}
