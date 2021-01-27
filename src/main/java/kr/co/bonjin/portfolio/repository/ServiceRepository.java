package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Service;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ServiceRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Service 전체 조회
     * @return
     */
    public List<Service> findAll() {
        List<Service> services = em.createQuery(
                "select w from Service w",
                Service.class
        ).getResultList();
        return services;
    }

    /**
     * Service 저장
     * @param service
     */
    public void save(Service service) {
        em.persist(service);
    }
}
