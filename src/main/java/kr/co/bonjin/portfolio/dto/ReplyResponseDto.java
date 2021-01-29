package kr.co.bonjin.portfolio.dto;

import kr.co.bonjin.portfolio.domain.Reply;
import lombok.Data;

@Data
public class ReplyResponseDto {

    private String content;

    private MemberResponseDto member;

    public ReplyResponseDto(Reply reply) {
        this.content = reply.getContent();
        this.member = new MemberResponseDto(reply.getMember());
    }
}
