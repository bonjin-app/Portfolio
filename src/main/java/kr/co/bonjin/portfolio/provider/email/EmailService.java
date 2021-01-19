package kr.co.bonjin.portfolio.provider.email;

import kr.co.bonjin.portfolio.common.constant.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RequiredArgsConstructor
@Service
public class EmailService {

    // Java 메일
    private final JavaMailSender javaMailSender;

    // Thymeleaf Template 사용
    private final TemplateEngine templateEngine;

    /**
     * Mail 전송 함수
     * @param to
     * @param subject
     * @param name
     * @param value
     * @param flag
     */
    public void sendSimpleMessage(String to, String subject, String name, String value, int flag) {
        // Thymeleaf 사용
        MimeMessagePreparator message = mimeMessage -> {

            String template = "";
            if (flag == Constants.EMAIL_TEMPLATE_FLAG_CONTACT) {
                template = Constants.EMAIL_TEMPLATE_ID;
            }

            String content = build(name, value, template);

            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setTo(to);
            messageHelper.setSubject(subject);
            messageHelper.setText(content, true);
        };
        javaMailSender.send(message);
    }

    /**
     * Thymeleaf 셋팅
     * @param name
     * @return
     */
    private String build(String name, String value, String template) {
        Context context = new Context();
        context.setVariable("name", name);
        context.setVariable("value", value);
        return templateEngine.process(template, context);
    }
}
