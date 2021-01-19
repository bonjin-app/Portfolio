package kr.co.bonjin.portfolio.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/service")
@RequiredArgsConstructor
public class ServiceController {

    @GetMapping
    public String servicePage() {
        return "service";
    }
}