package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Reply;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ReplyRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Reply 저장
     * @param reply
     */
    public void save(Reply reply) {
        em.persist(reply);
    }
}