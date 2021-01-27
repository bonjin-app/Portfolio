package kr.co.bonjin.portfolio.web.form;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@ToString
public class ContactForm {

    private String name;

    private String email;

    private String subject;

    private String message;
}
