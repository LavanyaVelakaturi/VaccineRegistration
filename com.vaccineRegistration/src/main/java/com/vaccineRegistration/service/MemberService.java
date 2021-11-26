package com.vaccineRegistration.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vaccineRegistration.entity.Member;
@Component
public interface MemberService {
	
	public Member addMember(Member member);
	public Member updateMember(Member member);
	public void deleteMember(Member member);
	
	public List<Member> getAllMember();

}
