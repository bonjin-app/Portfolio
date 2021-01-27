package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Contact;
import kr.co.bonjin.portfolio.repository.ContactRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ContactServiceTest {

    @Autowired
    ContactService contactService;

    @Autowired
    ContactRepository contactRepository;

    @Test
    public void save() throws Exception {
        //given
        Contact contact = Contact.builder()
                .name("BONJIN")
                .subject("동료가 되고싶습니다.")
                .message("동료가 되고싶어 연락드렸습니다.")
                .email("tp.gigas@gmail.com")
                .build();

        //when
        Long savedId = contactService.save(contact);

        //then
        assertEquals(contact, contactRepository.findOne(savedId));
    }
}