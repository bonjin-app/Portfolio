package kr.co.bonjin.portfolio.api;

import kr.co.bonjin.portfolio.common.response.ApiDataResponse;
import kr.co.bonjin.portfolio.common.response.ApiResponse;
import kr.co.bonjin.portfolio.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContactApiController {

    private final ContactService contactService;

    @PostMapping("/api/contact")
    public ApiResponse send(@RequestParam("name") String name,
                            @RequestParam("email") String email,
                            @RequestParam("subject") String subject,
                            @RequestParam("message") String message) {

        contactService.contact(name, email, subject, message);

        return new ApiDataResponse<>("");
    }
}
