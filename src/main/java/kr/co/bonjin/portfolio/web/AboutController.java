package kr.co.bonjin.portfolio.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/about")
@RequiredArgsConstructor
public class AboutController {

    @GetMapping
    public String aboutPage() {
        return "about";
    }
}
