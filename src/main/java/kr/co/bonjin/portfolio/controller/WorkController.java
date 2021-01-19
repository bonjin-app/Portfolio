package kr.co.bonjin.portfolio.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/work")
@RequiredArgsConstructor
public class WorkController {

    @GetMapping
    public String workPage() {
        return "work";
    }

    @GetMapping("/{id}")
    public String workDetailPage(@PathVariable Long id) {
        return "work-detail";
    }
}
