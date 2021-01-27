package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.domain.Work;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ReplyRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Reply 전체 조회
     * @return
     */
    public List<Reply> findAll() {
        List<Reply> replies = em.createQuery(
                "select r from Reply r",
                Reply.class
        ).getResultList();
        return replies;
    }

    /**
     * Reply 저장
     * @param reply
     */
    public void save(Reply reply) {
        em.persist(reply);
    }
}