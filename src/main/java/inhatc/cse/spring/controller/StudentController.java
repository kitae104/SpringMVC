package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.Student;
import inhatc.cse.spring.dto.StudentInfo;
import inhatc.cse.spring.dto.StudentInfomation;
import inhatc.cse.spring.validatator.StudentValidator;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/student/validate", method = RequestMethod.GET)
    public String validateForm(){
        return "student/validateForm";
    }

    //==================================
    // 유효성 검사 체크하기
    //==================================
    @RequestMapping(value = "/student/validate", method = RequestMethod.POST)
    public String validate(Student student, BindingResult bindingResult, Model model){

        StudentValidator validator = new StudentValidator();
        validator.validate(student, bindingResult);

        if(bindingResult.hasErrors()){
            return "student/validateForm";
        }

        model.addAttribute("studentInfo", student);
        return "student/validate";
    }

    @RequestMapping(value = "/student/validate2", method = RequestMethod.GET)
    public String validateForm2(){
        return "student/validateForm";
    }
    @RequestMapping(value = "/student/validate2", method = RequestMethod.POST)
    public String validate(@Valid StudentInfomation studentInfomation, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getDefaultMessage());
            }
            return "student/validateForm";
        }

        model.addAttribute("studentInfo", studentInfomation);
        return "student/validate";
    }
}
