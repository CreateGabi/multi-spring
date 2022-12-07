package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bbs3Controller {

	@Autowired
	Bbs3DAO dao;
	
	@RequestMapping("bbsList")
	public void list(Model model) {
		List<Bbs3VO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbsList2")
	public void list2(PageVO vo, Model model) {
		List<Bbs3VO> list = dao.list2(vo);
		model.addAttribute("list", list);
	}
}
