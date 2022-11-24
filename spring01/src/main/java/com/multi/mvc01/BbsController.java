package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;

	@RequestMapping("insert2.multi")
	public void insert(BbsDTO dto) {
		System.out.println(dto);
		dao.insert(dto);
	}

	@RequestMapping("delete2.multi")
	public String delete(int id) {
		System.out.println("받은 아이디는  " + id);
		int result = dao.delete(id);
		// 결과를 담는 페이지로 넘어가게 되어있음
		// /WEB-INF/views/delete.jsp를 자동호출하게 되어있음
		// spring 프로그램에 어떤 이름의 파일을 호출할지 이름을 리턴해주세요
		if (result == 1) {
			return "ok";
		} else {
			return "no";
		}
	}
	
	@RequestMapping("one")
	public void one(int id, Model model) {
		BbsDTO dto = dao.one(id);
		// views까지 처리결과인 dto를 전달해주는 역할
		model.addAttribute("dto", dto);
	}
}
