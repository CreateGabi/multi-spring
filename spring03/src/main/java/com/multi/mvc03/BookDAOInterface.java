package com.multi.mvc03;

import java.util.List;

public interface BookDAOInterface {

	void insert(BookVO vo);

	void update(BookVO vo);

	void delete(BookVO vo);

	BookVO one(BookVO vo);

	List<BookVO> all();

	List<BookVO> bookAll(PageVO vo);

	int count();

}