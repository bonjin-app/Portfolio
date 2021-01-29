package kr.co.bonjin.portfolio.web;

import kr.co.bonjin.portfolio.dto.ServiceResponseDto;
import kr.co.bonjin.portfolio.service.ServiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/service")
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping
    public String servicePage(Model model) {
        List<ServiceResponseDto> services = serviceService.findAll();

        model.addAttribute("services", services);
        return "service";
    }
}
