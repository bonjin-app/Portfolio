package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Skill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SkillRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Skill skill) {
        em.persist(skill);
    }
}
