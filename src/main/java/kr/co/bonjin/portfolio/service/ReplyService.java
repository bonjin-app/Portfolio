package kr.co.bonjin.portfolio.service;


import kr.co.bonjin.portfolio.domain.Reply;

public interface ReplyService {
    /**
     * Reply 저장
     * @param reply
     * @return
     */
    Long save(Reply reply);
}
