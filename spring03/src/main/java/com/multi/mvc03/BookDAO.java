package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO {

	// mybatis를 끼자
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BookVO vo) {
		my.insert("book.create", vo);
	}
	
	public void update(BookVO vo) {
		my.update("book.up2", vo);
	}
	
	public void delete(BookVO vo) {
		int result = my.delete("book.delete2", vo);
		System.out.println("삭제갯수: " + result);
	}
	
	public BookVO one(BookVO vo) {
		return my.selectOne("book.one", vo);
	}
	
	public List<BookVO> all() {
		return my.selectList("book.all");
	}
}
