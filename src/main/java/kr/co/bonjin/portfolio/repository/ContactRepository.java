package kr.co.bonjin.portfolio.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ContactRepository {

    @PersistenceContext
    private EntityManager entityManager;
}
