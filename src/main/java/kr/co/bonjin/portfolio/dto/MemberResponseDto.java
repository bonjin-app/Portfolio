package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.domain.Skill;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class MemberResponseDto {

    private String name;
    private String image;

    private List<SkillItemDto> skills;

    public MemberResponseDto(Member member, List<Skill> skills) {
        this.name = member.getName();
        this.skills = skills.stream()
                        .map(SkillItemDto::new)
                        .collect(Collectors.toList());
    }

    public MemberResponseDto(Member member) {
        this.name = member.getName();
        this.image = member.getImage();
    }
}
