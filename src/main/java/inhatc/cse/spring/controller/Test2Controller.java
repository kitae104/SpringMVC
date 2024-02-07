package inhatc.cse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestMapping("/test2")
public class Test2Controller {

    @RequestMapping("/view")
    public String view(){
        return "test2/view";
    }
}
