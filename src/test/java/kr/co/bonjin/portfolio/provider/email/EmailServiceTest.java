package kr.co.bonjin.portfolio.provider.email;

import kr.co.bonjin.portfolio.common.constant.Constants;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {

    // 이메일 발송 테스트
    @Autowired
    private EmailService emailService;

    @Disabled("Disable until bug #1")
    @Test
    @DisplayName("TEST Mail Sender")
    public void send() {
        String to = "bonjin.app@gmail.com";
        String subject = "메일 테스트";
        String name = "GIGAS";
        String value = "메일 내용";

        try {
            emailService.sendSimpleMessage(to,
                    subject,
                    name,
                    value,
                    Constants.EMAIL_TEMPLATE_FLAG_CONTACT);

        } catch (MailException e) {
            fail("메일 발송 실패");
        }
    }
}