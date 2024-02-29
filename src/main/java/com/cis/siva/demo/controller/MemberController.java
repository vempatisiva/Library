package com.cis.siva.demo.controller;

import com.cis.siva.demo.entity.LibraryMember;
import com.cis.siva.demo.model.Member;
import com.cis.siva.demo.service.MemberService;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public Member getMember(Integer memberId){

        return memberService.getMember(memberId);
    }

    // create a member
    @PostMapping
    public LibraryMember createMember(@RequestBody LibraryMember member){
        return memberService.createMember(member);
    }
}