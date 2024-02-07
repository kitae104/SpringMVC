package inhatc.cse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    @RequestMapping("/param/confirmId")
    public String confirmId(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model){
        System.out.println("confirmId()");

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        return "param/confirmId";
    }

    @RequestMapping("/param/{num}")
    public String pathVariable(@PathVariable int num, Model model){
        System.out.println("pathVariable()");

        model.addAttribute("num", num);

        return "param/pathvariable";
    }
}
