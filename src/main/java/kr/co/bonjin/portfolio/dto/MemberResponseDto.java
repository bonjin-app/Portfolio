package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Member;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class MemberResponseDto {

    private String name;

    private List<SkillItemDto> skills;

    public MemberResponseDto(Member member) {
        this.name = member.getName();
        this.skills = member.getSkills().stream()
                        .map(SkillItemDto::new)
                        .collect(Collectors.toList());
    }
}
