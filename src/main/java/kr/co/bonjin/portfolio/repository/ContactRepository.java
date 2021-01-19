package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
