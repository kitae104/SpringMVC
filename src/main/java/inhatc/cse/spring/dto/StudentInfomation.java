package inhatc.cse.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentInfomation {

    @NotBlank(message = "이름을 입력해주세요.")
    @Size(min = 2 , max = 10 , message = "이름은 2자 이상 , 5자 이하여야 합니다.")
    private String name;

    @NotBlank(message = "나이를 입력해주세요.")
    @Size(min = 8 , max = 13 , message = "나이는 8~13세 사이의 사용자만 가입이 가능합니다.")
    private int age;

    @NotBlank(message = "학년을 입력해주세요.")
    @Size(min = 1 , max = 6 , message = "학년은 1~6학년 사이의 사용자만 가입이 가능합니다.")
    private int gradeNum;

    @NotBlank(message = "번호를 입력해주세요.")
    @Size(min = 1 , max = 26 , message = "번호는 1~26번 사이의 번호만 가입이 가능합니다.")
    private int classNum;

}
