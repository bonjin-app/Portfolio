package kr.co.bonjin.portfolio.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/contact")
@RequiredArgsConstructor
public class ContactController {

    @GetMapping
    public String contactPage(Model model) {
        return "contact";
    }
}
