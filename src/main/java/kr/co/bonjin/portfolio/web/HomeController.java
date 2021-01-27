package kr.co.bonjin.portfolio.web;

import kr.co.bonjin.portfolio.dto.ReplyResponseDto;
import kr.co.bonjin.portfolio.dto.WorkResponseDto;
import kr.co.bonjin.portfolio.service.ReplyService;
import kr.co.bonjin.portfolio.service.WorkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final WorkService workService;
    private final ReplyService replyService;

    @GetMapping(value = {"", "/", "/home"})
    public String homePage(Model model) {
        List<WorkResponseDto> works = workService.findAll();
        List<ReplyResponseDto> replies = replyService.findAll();

        model.addAttribute("works", works);
        model.addAttribute("replies", replies);
        return "home";
    }

}
