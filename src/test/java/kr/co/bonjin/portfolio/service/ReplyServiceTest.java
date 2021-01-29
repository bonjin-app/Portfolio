package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ReplyServiceTest {

    @Autowired
    private EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void save() throws Exception {
        //given
        // Member
        Member member = memberRepository.findOne(1L);

        Reply reply = new Reply("http://gigas.synology.me/portfolio/images/man-profile-512x512.png");
        reply.setMember(member);

        //when
        em.persist(reply);

        //then
        assertEquals(reply, em.find(Reply.class, reply.getId()));
    }
}