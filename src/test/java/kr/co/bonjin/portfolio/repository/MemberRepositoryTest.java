package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.domain.Skill;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    EntityManager em;

    @BeforeEach
    public void init() {
        Member member = new Member();

        memberRepository.save(member);

        IntStream.rangeClosed(1, 3)
                .forEach(e -> {
                    Skill skill = Skill.builder()
                            .title("title" + e)
                            .progress(e)
                            .member(member)
                            .build();

                    skillRepository.save(skill);
                });
    }

    @Test
    public void findAll() {
        List<Member> members = memberRepository.findAll();

        em.createQuery(
                "select m from Member m" +
                        " join fetch m.skills s", Member.class
        ).getResultList();

//        for (Member member : members) {
//            for (Skill skill : member.getSkills()) {
//                skill.getTitle();
//            }
//        }
    }

    @Test
    public void findWork() {
        em.find(Member.class, 1L);

        em.createQuery("select m from Member m" +
                " join fetch m.works w", Member.class)
                .getResultList();
    }
}