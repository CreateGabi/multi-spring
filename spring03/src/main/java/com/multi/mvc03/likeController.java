package com.multi.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class likeController {

	@RequestMapping("fruit")
	public void fruit() {
		// views/fruit.jsp를 자동호출
	}
	
	@RequestMapping("tour")
	public void tour() {
	}
}
