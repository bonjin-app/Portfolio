package kr.co.bonjin.portfolio.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactController {

    @GetMapping
    public String contactPage() {
        return "contact";
    }
}