package com.care.root.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.root.common.SessionName;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller

@RequestMapping("member")
public class MemberController implements SessionName {
	@Autowired MemberService ms;
	
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("/user_check")
	public String user_check(HttpServletRequest request,
						RedirectAttributes rs) {
		int result = ms.user_check(request);
		if(result == 0) {
			rs.addAttribute("id", 
					request.getParameter("id") );
			return "redirect:successLogin";
		}
		return "redirect:login";
	}
	
	@GetMapping("successLogin")
	public String succcessLogin(String id,HttpSession session) {
		//session.setAttribute("loginUser", id);
		session.setAttribute( LOGIN, id);
		System.out.println("id: "+id);
		return "member/successLogin";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"redirect:/index";
	}
	
	@GetMapping("/memberInfo")
	public String memberInfo() {
		ArrayList<MemberDTO> list = ms.list();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setAddr("addr");
		dto.setPw("pw");
		
		list.add(dto);
		return "member/memberInfo";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "member/register";
	}
	
	
}
