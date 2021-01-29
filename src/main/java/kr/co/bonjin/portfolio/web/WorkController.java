package kr.co.bonjin.portfolio.web;

import kr.co.bonjin.portfolio.dto.WorkResponseDto;
import kr.co.bonjin.portfolio.service.WorkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/work")
@RequiredArgsConstructor
public class WorkController {

    private final WorkService workService;

    @GetMapping
    public String workPage(Model model) {
        List<WorkResponseDto> works = workService.findAll();

        model.addAttribute("works", works);
        return "work";
    }

    @GetMapping(value = "/{id}")
    public String workDetailPage(@PathVariable Long id, Model model) {
        List<WorkResponseDto> works = workService.findAll();

        WorkResponseDto work = works.stream()
                .filter(f -> f.getWorkId().equals(id))
                .findFirst()
                .get();

        model.addAttribute("work", work);
        model.addAttribute("works", works);
        return "work-detail";
    }
}
