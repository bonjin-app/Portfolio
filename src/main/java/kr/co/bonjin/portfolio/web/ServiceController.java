package kr.co.bonjin.portfolio.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/service")
@RequiredArgsConstructor
public class ServiceController {

    @GetMapping
    public String servicePage(Model model) {
        return "service";
    }
}