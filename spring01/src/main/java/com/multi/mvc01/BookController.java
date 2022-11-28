package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("list.multi")
	public void list(Model model) {
		ArrayList<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		BookDTO dto = dao.one(id);
		model.addAttribute("dto", dto);
	}

	@RequestMapping("delete3.multi")
	public void delete(int id) {
		dao.delete(id);
	}

	@RequestMapping("insert3.multi")
	public void insert(BookDTO dto) {
		System.out.println(dto);
		dao.insert(dto);
	}
}
