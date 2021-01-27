package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Skill;
import lombok.Data;

@Data
public class SkillItemDto {

    private String title;
    private Integer progress;

    public SkillItemDto(Skill skill) {
        this.title = skill.getTitle();
        this.progress = skill.getProgress();
    }
}
