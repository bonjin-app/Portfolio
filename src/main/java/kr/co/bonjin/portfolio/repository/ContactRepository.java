package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Contact;
import kr.co.bonjin.portfolio.domain.Work;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ContactRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * Contact 저장
     * @param contact
     */
    public void save(Contact contact) {
        em.persist(contact);
    }

    /**
     * Contact 단건 조회
     * @param id
     * @return
     */
    public Contact findOne(Long id) {
        return em.find(Contact.class, id);
    }

    /**
     * Contact 전체 조회
     * @return
     */
    public List<Contact> findAll() {
        List<Contact> contacts = em.createQuery(
                "select c from Contact c",
                Contact.class
        ).getResultList();
        return contacts;
    }
}
