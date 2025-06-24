package com.edu.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private MemberRepository dao;
	
	public Member insert(Member member) {
		Member resultMember = dao.save(member);
		return resultMember;
	}
	public Optional<Member> select(Long id){
		Optional<Member> member = dao.findById(id);
		return member;
	}
	public List<Member> selectAll(){
		return dao.findAll();
	}
	public void delete(Long id) {
		dao.deleteById(id);
	}
	public Member update(Member member) {
		Member resultMember = dao.save(member);
		return resultMember;
	}
}
