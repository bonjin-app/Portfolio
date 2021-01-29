package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.dto.MemberResponseDto;

public interface MemberService {

    /**
     * Member 저장
     * @param member
     * @return
     */
    Long save(Member member);

    /**
     *
     * @param name
     * @return
     */
    MemberResponseDto findSkills(String name);
}
