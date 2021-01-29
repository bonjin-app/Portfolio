package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.dto.MemberResponseDto;
import kr.co.bonjin.portfolio.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    @Override
    public Long save(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    @Override
    public MemberResponseDto findSkills(String name) {
        Member member = memberRepository.findOne(name);

        MemberResponseDto memberResponseDto = new MemberResponseDto(member, member.getSkills());

        return memberResponseDto;
    }
}
