package kr.co.bonjin.portfolio.web;

import kr.co.bonjin.portfolio.dto.MemberResponseDto;
import kr.co.bonjin.portfolio.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/about")
@RequiredArgsConstructor
public class AboutController {

    private final MemberService memberService;

    @GetMapping
    public String aboutPage(Model model) {

        MemberResponseDto member = memberService.findSkills("GIGAS");

        model.addAttribute("member", member);
        model.addAttribute("skills", member.getSkills());

        return "about";
    }
}
