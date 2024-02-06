package inhatc.cse.spring.validatator;

import inhatc.cse.spring.dto.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.isAssignableFrom(clazz); // 검증할 객체의 클래스 타입 정보
    }

    @Override
    public void validate(Object target, Errors errors) {
        System.out.println("validate()");
        Student student = (Student)target;

        String studentName = student.getName();
        if(studentName == null || studentName.trim().isEmpty()){
            System.out.println("이름이 널이거나 빈칸 입니다.");
            errors.reject("name", "이름이 널이거나 빈칸 입니다.");
        }

        int age = student.getAge();
        if(age < 8 || age > 13){
            System.out.println("나이가 8~13세 사이가 아닙니다.");
            errors.reject("age", "나이가 8~13세 사이가 아닙니다.");
        }

        int gradeNum = student.getGradeNum();
        if(gradeNum < 1 || gradeNum > 6){
            System.out.println("학년이 1학년 ~ 6학년 사이가 아닙니다.");
            errors.reject("gradeNum", "학년이 1학년 ~ 6학년 사이가 아닙니다.");
        }

        int classNum = student.getClassNum();
        if(classNum < 1 || classNum > 26){
            System.out.println("번호가 1~26번 사이가 아닙니다.");
            errors.reject("classNum", "번호가 1~26번 사이가 아닙니다.");
        }
    }
}
