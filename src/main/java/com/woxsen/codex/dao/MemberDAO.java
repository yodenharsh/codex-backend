package com.woxsen.codex.dao;

import java.util.List;
import java.util.UUID;

import com.woxsen.codex.entities.Member;

public interface MemberDAO {
	
	public List<Member> findAll();
	
	public Member findById(UUID id);
	
	public UUID addMember(Member member);
	
	public boolean deleteById(UUID id);
	
	public Member updateMember(UUID id, Member member);
	
}
