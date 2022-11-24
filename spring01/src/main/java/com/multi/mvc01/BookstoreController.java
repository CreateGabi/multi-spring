package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookstoreController {
	
	@Autowired
	BookstoreDAO dao;
	
	@RequestMapping("insertBookstore")
	public void insert(BookstoreDTO dto) {
		dao.insert(dto);
	}
	
	@RequestMapping("deleteBookstore")
	public String delete(String id) {
		int result = dao.delete(id);
		if (result == 1) {
			return "ok";
		} else {
			return "no";
		}
	}
	
	@RequestMapping("updateBookstore")
	public String update(BookstoreDTO dto) {
		int result = dao.update(dto);
		if (result == 1) {
			return "ok";
		} else {
			return "no";
		}
	}
	
	@RequestMapping("oneBookstore")
	public void one(String id, Model model) {
		BookstoreDTO dto = dao.one(id);
		model.addAttribute("dto", dto);
	}
}
