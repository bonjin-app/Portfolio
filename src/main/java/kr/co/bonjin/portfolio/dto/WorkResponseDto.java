package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.domain.WorkType;
import lombok.Data;

@Data
public class WorkResponseDto {

    private Long workId;
    private WorkType type;
    private String name;
    private String content;
    private String image;

    public WorkResponseDto(Work work) {
        this.workId = work.getId();
        this.type = work.getType();
        this.name = work.getName();
        this.content = work.getContent();
        this.image = work.getImage();
    }
}
