package kr.co.bonjin.portfolio.web.form;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class ContactForm {

    @NotEmpty(message = "이름은 필수 입니다.")
    private String name;

    @NotEmpty(message = "email은 필수 입니다.")
    private String email;

    @NotEmpty(message = "제목은 필수 입니다.")
    private String subject;

    @NotEmpty(message = "내용은 필수 입니다.")
    private String message;
}
