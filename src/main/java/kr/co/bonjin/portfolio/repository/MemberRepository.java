package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.domain.Work;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Member 단건 조회
     * @param id
     * @return
     */
    public Member findOne(Long id) {
        Member member = em.find(Member.class, id);
        return member;
    }

    /**
     * Member 전체 조회
     * @return
     */
    public List<Member> findAll() {
        List<Member> members = em.createQuery("select m from Member m", Member.class)
                .getResultList();
        return members;
    }

    /**
     * Member 저장
     * @param member
     */
    public void save(Member member) {
        em.persist(member);
    }
}
