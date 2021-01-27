package kr.co.bonjin.portfolio.api;

import kr.co.bonjin.portfolio.common.response.ApiDataResponse;
import kr.co.bonjin.portfolio.common.response.ApiResponse;
import kr.co.bonjin.portfolio.dto.WorkResponseDto;
import kr.co.bonjin.portfolio.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WorkApiController {

    private final WorkService workService;

    @GetMapping(value = "/api/works")
    public ApiResponse works() {
        List<WorkResponseDto> works = workService.findAll();
        return new ApiDataResponse<>(works);
    }
}
