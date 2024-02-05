package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.StudentInfo;
import inhatc.cse.spring.dto.StudentInfomation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @RequestMapping("/student/form")
    public String goForm(){
        return "student/form";
    }

    @GetMapping("/student/studentInfo")
    public String studentInfo(StudentInfo studentInfo, Model model){
        String studentId = studentInfo.getId();
        model.addAttribute("studentId", studentId);
        return "student/studentId";
    }

    @GetMapping("/student/studentForm")
    public String goStudentForm(){
        return "student/studentForm";
    }

    @GetMapping("/student/view")
    public String studentView(@ModelAttribute("student")StudentInfomation studentInfomation){
        return "student/view";
    }

    @RequestMapping(value = "/student/redirect")
    public String redirect(@RequestParam("id") String id){
        if(id.equals("id")){
            return "redirect:/student/yes";
        } else {
            return "redirect:/student/no";
        }
    }

    @RequestMapping("/student/yes")
    public String yes(){
        return "student/yes";
    }

    @RequestMapping("/student/no")
    public String no(){
        return "student/no";
    }
}
