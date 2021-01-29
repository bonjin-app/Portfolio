package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.dto.ReplyResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReplyRepositoryTest {


    @Autowired
    EntityManager em;


    @Test
    public void findAll() {
        List<Reply> replies = em.createQuery("select r from Reply r" +
                " join fetch r.member m", Reply.class)
                .getResultList();

        replies.stream()
                .map(ReplyResponseDto::new)
                .collect(Collectors.toList());
    }
}