package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO implements BookDAOInterface {

	// mybatis를 끼자
	@Autowired
	SqlSessionTemplate my;
	
	@Override
	public void insert(BookVO vo) {
		my.insert("book.create", vo);
	}
	
	@Override
	public void update(BookVO vo) {
		my.update("book.up2", vo);
	}
	
	@Override
	public void delete(BookVO vo) {
		int result = my.delete("book.delete2", vo);
		System.out.println("삭제갯수: " + result);
	}
	
	@Override
	public BookVO one(BookVO vo) {
		return my.selectOne("book.one", vo);
	}
	
	@Override
	public List<BookVO> all() {
		return my.selectList("book.all");
	}
	
	@Override
	public List<BookVO> bookAll(PageVO vo) {
		return my.selectList("book.bookAll", vo);
	}
	
	@Override
	public int count() {
		return my.selectOne("book.count");
	}
}
