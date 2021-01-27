package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Contact;
import kr.co.bonjin.portfolio.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Transactional
    @Override
    public Long save(Contact contact) {
        contactRepository.save(contact);
        return contact.getId();
    }
}
