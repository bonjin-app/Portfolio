package kr.co.bonjin.portfolio.api;

import kr.co.bonjin.portfolio.common.response.ApiDataResponse;
import kr.co.bonjin.portfolio.common.response.ApiResponse;
import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.dto.MemberResponseDto;
import kr.co.bonjin.portfolio.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberRepository memberRepository;

    @GetMapping(value = "/api/members")
    public ApiResponse members() {

        List<Member> members = memberRepository.findAll();
        List<MemberResponseDto> collect = members.stream()
                .map(MemberResponseDto::new)
                .collect(Collectors.toList());

        return new ApiDataResponse<>(collect);
    }
}
