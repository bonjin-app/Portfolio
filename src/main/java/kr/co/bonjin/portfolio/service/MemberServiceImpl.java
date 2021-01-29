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
        System.out.println("member1 = " + member);
        memberRepository.save(member);
        System.out.println("member2 = " + member);

        Member result = memberRepository.findOne(member.getId());

        return member.getId();
    }

    @Override
    public MemberResponseDto findSkills(String name) {
        Member member = memberRepository.findOne(name);

        MemberResponseDto memberResponseDto = new MemberResponseDto(member, member.getSkills());

        return memberResponseDto;
    }
}
