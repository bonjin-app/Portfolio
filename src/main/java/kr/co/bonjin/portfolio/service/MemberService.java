package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Member;

public interface MemberService {

    /**
     * Member 저장
     * @param member
     * @return
     */
    Long save(Member member);
}
