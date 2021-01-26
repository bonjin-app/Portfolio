package kr.co.bonjin.portfolio.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/work")
@RequiredArgsConstructor
public class WorkController {

    @GetMapping
    public String workPage(Model model) {
        return "work";
    }

    @GetMapping(value = "/{id}")
    public String workDetailPage(@PathVariable Long id) {
        return "work-detail";
    }
}