package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@RequestMapping("insert2.multi")
	public void insert2(BbsDTO bag) {
		System.out.println("가방으로 전달받은 id: " + bag.getId());
		System.out.println("가방으로 전달받은 title: " + bag.getTitle());
		System.out.println("가방으로 전달받은 content: " + bag.getContent());
		System.out.println("가방으로 전달받은 writer: " + bag.getWriter());
	}
}
