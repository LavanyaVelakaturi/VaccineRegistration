package com.vaccineRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccineRegistration.entity.Member;
import com.vaccineRegistration.service.MemberService;
@RestController
@RequestMapping(value="/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/add")
	private Member addMember(@RequestBody Member member) {
		return memberService.addMember(member);
		
	}
	@PutMapping("/update")
	private Member updateMember(@RequestBody Member member) {
		return memberService.updateMember(member);
		
	}
	@DeleteMapping("/delete")
	private void deleteMember(@RequestBody Member member) {
		 memberService.deleteMember(member);
		
	}
	@GetMapping("/allmembers")
	private List<Member> getAllMember(){
		return memberService.getAllMember();
	}

}
