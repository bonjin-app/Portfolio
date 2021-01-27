package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Contact;

public interface ContactService {

    /**
     * Contact 저장
     * @param contact
     * @return
     */
    Long save(Contact contact);
}
