package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO implements MemberDAOInterface {

	@Autowired
	SqlSessionTemplate my;
	
	@Override
	public void insert(MemberVO vo) {
		my.insert("member.create", vo);
	}
	
	@Override
	public void update(MemberVO vo) {
		my.update("member.up", vo);
	}
	
	@Override
	public void delete(MemberVO vo) {
		my.delete("member.del", vo);
	}
	
	@Override
	public MemberVO one(MemberVO vo) {
		return my.selectOne("member.one", vo);
	}
	
	@Override
	public List<MemberVO> all() {
		return my.selectList("member.all");
	}
}
