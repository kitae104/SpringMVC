package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping(value = "/data")
    public String getData(){
        return "Hello Spring! 스프링을 배워요";
    }

    @RequestMapping(value = "/dto")
    public Member getMember(){
        Member member = new Member();
        member.setName("김기태");
        member.setId("kkt");
        member.setPw("1234");
        member.setEmail("kkt@inhatc.ac.kr");
        return member;
    }
}
