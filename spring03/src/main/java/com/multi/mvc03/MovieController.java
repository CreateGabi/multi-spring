package com.multi.mvc03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MovieController {
	
	@RequestMapping("uploadForm")
	public void uploadForm(HttpServletRequest request, MultipartFile file, Model model) {
		System.out.println(request.getContextPath());
	}

	@RequestMapping("movie")
	public void computer(MovieVO vo, Model model) {
		System.out.println("컨트롤러에서 받은 값>> " + vo);
		model.addAttribute("vo", vo);
	}
}
