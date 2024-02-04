package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @RequestMapping("/member/params")
    public String params(
            @RequestParam("name")String name,
            @RequestParam("id")String id,
            @RequestParam("pw")String pw,
            @RequestParam("email")String email, Model model){

        Member member = new Member();
        member.setName(name);
        member.setId(id);
        member.setPw(pw);
        member.setEmail(email);

        model.addAttribute("member", member);

        return "member/params";
    }

    @RequestMapping("/member/dto")
    public String dto(Member member, Model model){

        model.addAttribute("member", member);

        return "member/dto";
    }

}
