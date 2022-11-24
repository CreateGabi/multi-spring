package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3.multi")
	public void insert(BookDTO dto) {
		System.out.println(dto);
		dao.insert(dto);
	}
}
