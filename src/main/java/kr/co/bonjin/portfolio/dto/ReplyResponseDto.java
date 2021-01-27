package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Reply;
import lombok.Data;

@Data
public class ReplyResponseDto {

    private String name;

    private String content;

    private String image;

    public ReplyResponseDto(Reply reply) {
        this.name = reply.getName();
        this.content = reply.getContent();
        this.image = reply.getImage();
    }
}
