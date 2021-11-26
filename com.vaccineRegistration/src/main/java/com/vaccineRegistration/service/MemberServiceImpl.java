package com.vaccineRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccineRegistration.entity.Member;
import com.vaccineRegistration.repository.MemberRepository;
@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	public MemberRepository memberRepository;
	@Override
	public Member addMember(Member member) {
		
		return memberRepository.save(member);
	}

	@Override
	public Member updateMember(Member member) {
		
		return memberRepository.save(member);
	}

	@Override
	public void deleteMember(Member member) {
		
		memberRepository.delete(member);
	}

	/*@Override
	public Member getMemberById(int idcardid) {
		return memberRepository.getById(idcardid);
		
	}

	@Override
	public Member getMemberByAdharNo(long adharno) {
		
		return memberRepository.g(adharno);
	}

	@Override
	public Member getMemberByPanNo(String panNo) {
		
		return memberRepository.;
	}*/

	@Override
	public List<Member> getAllMember() {
		return memberRepository.findAll();
		
	}
	
	

}
