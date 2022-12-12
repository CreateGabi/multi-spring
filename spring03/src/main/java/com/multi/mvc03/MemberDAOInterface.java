package com.multi.mvc03;

import java.util.List;

public interface MemberDAOInterface {

	void insert(MemberVO vo);

	void update(MemberVO vo);

	void delete(MemberVO vo);

	MemberVO one(MemberVO vo);

	List<MemberVO> all();

}