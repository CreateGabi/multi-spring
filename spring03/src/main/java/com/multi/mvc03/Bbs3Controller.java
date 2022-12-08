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
	
	@Autowired
	PageService page;
	
	@RequestMapping("bbsList")
	public void list(Model model) {
		List<Bbs3VO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbsList2")
	public void list2(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<Bbs3VO> list = dao.list2(vo);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbsAll")
	public void list3(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<Bbs3VO> list = dao.all(vo);
		int count = dao.count();  // 게시물 전체 개수
		int pages = page.pages(count);
//		int pages = 0;
//		if (count % 10 == 0) {
//			pages = count / 10;
//		} else {
//			pages = count / 10 + 1;
//		}
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		// Object <-- int(자동형변환, upcasting업캐스팅, 큰<--작)
		// Object --> int(강제형변환, downcasting다운캐스팅, 큰-->작)
		// 클래스간 타입변환은 상속관계에 있을 때에만 가능
		// Integer <-- String : 불가능!
	}
}
