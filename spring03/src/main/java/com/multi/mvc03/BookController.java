package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;

	@RequestMapping("insert.do")
	public void insert(BookVO vo) {
		// db처리해야함.
		dao.insert(vo);
		// 처리결과를 views/insert.jsp를 호출해서 넣을 예정
	}
	
	@RequestMapping("up2")
	public void update(BookVO vo) {
		dao.update(vo);
	}
	
	@RequestMapping("delete2")
	public void delete(BookVO vo) {
		dao.delete(vo);
	}
	
	@RequestMapping("one2")  // Model은 컨트롤러 안에서만
	public void one(BookVO vo, Model model) {
		BookVO result = dao.one(vo);
		model.addAttribute("vo", result);
	}
	
	@RequestMapping("all2")
	public void all(Model model) {
		List<BookVO> list = dao.all();
		model.addAttribute("list", list);
	}
}
