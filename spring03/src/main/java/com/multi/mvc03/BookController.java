package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAOInterface dao;
	
	@Autowired
	PageService page;

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
	
	@RequestMapping("bookAll")
	public void list3(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BookVO> list = dao.bookAll(vo);
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
