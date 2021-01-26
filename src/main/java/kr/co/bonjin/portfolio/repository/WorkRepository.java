package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Work;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class WorkRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Work 전체 조회
     * @return
     */
    public List<Work> findAll() {
        List<Work> works = em.createQuery(
                "select w from Work w",
                Work.class
        ).getResultList();
        return works;
    }

    /**
     * Work 단건 조회
     * @param id
     * @return
     */
    public Work findOne(Long id) {
        Work work = em.find(Work.class, id);
        return work;
    }

    /**
     * Work 저장
     * @param work
     */
    public void save(Work work) {
        em.persist(work);
    }
}