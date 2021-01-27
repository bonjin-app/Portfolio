package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Reply;
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

    @Test
    public void save() throws Exception {
        //given
        Reply reply = Reply.builder()
                .name("GIGAS")
                .content("Will you study for life?")
                .image("http://gigas.synology.me/portfolio/images/man-profile-512x512.png")
                .build();

        //when
        em.persist(reply);

        //then
        assertEquals(reply, em.find(Reply.class, reply.getId()));
    }
}