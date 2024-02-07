package inhatc.cse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/test/view")
    public String view(){
        return "test/view";
    }

    @RequestMapping(value = "/test/content", method = RequestMethod.GET)
    public String content(Model model){
        model.addAttribute("id", "abcd");
        return "test/content";
    }

    @GetMapping("/test/modelview")
    public ModelAndView modelAndView(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("id", "abcde");
        mv.setViewName("/test/modelview");
        return mv;
    }
}
