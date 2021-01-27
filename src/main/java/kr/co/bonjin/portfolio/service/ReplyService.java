package kr.co.bonjin.portfolio.service;


import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.dto.ReplyResponseDto;

import java.util.List;

public interface ReplyService {

    /**
     * Reply 전체 조회
     * @return
     */
    List<ReplyResponseDto> findAll();

    /**
     * Reply 저장
     * @param reply
     * @return
     */
    Long save(Reply reply);
}
