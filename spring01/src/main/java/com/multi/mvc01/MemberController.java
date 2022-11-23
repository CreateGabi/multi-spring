package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // 스프링에 컨트롤러 역할을 하는 클래스라고 등록
public class MemberController {

	@Autowired  // 이미 만들어서 준비된 MemberDAO 객체의 주소를 찾아서 자동으로 그 주소를 아래의 변수인 dao에 넣어주세요
	MemberDAO dao;
	
	// 회원가입처리
	@RequestMapping("insert.multi")
	public void insert(MemberDTO bag, MemberDAO dao) {
		// 1-1) 데이터를 받아라
		// 1-2) bag을 만들어서
		// 1-3) bag에 집어넣어라
		//      set~()메서드가 자동호출
		System.out.println("클라이언트 회원가입 처리 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		// DAO를 이용해서 db처리를 해보자
		// MemberDAO dao = new MemberDAO(); 프로토타입
		// insert 메서드의 변수로 선언해주면, 스프링이 프로토타입으로 만들어서 준다.
		// public void insert(MemberDTO bag, MemberDAO dao)
		dao.insert(bag);
	}
	
	// 로그인처리
	@RequestMapping("login.multi")
	public String login(MemberDTO bag) {
		System.out.println("클라이언트 로그인 처리 요청됨.");
		System.out.println(bag);
		int result = dao.login(bag);
		System.out.println(dao);
		if (result == 1) {
			return "ok";
		} else {
			return "redirect:member.jsp";
		}
		
//		String id2 = "root";
//		String pw2 = "1234";
//		if (id2.equals(bag.getId()) && pw2.equals(bag.getPw())) {
//			// 로그인 성공
//			return "ok";
//		} else {
//			// 로그인 실패
////			return "no";
//			// 실패했을 때, webapp아래에 있는 member.jsp를 다시 호출하게 하고 싶음
//			// webapp아래 jsp는 클라이언트(브라우저)가 호출하는 페이지이므로
//			// 서버가 브라우저에게 member.jsp를 호출하라고 하면 됨
//			// response.sendRedirect("member.jsp");
//			return "redirect:member.jsp";
//		}
	}
	
	// 회원수정처리
	// 회원탈퇴처리
	@RequestMapping("delete.multi")
	public void delete(String id) {
		// 변수명이 다를 경우
		// delete(@RequestParam("id") String writer)
		System.out.println("받은 아이디는  " + id);
		// dao.delete(id);
		// 결과를 담는 페이지로 넘어가게 되어있음
		// /WEB-INF/views/delete.jsp를 자동호출하게 되어있음
	}
	// 전체회원정보처리
	// 회워정보처리
}
