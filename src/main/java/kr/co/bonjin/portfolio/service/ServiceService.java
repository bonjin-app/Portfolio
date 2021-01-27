package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Service;
import kr.co.bonjin.portfolio.dto.ServiceResponseDto;

import java.util.List;

public interface ServiceService {

    /**
     * Service 전체 조회
     * @return
     */
    List<ServiceResponseDto> findAll();

    /**
     * Service 저장
     * @param service
     * @return
     */
    Long save(Service service);
}
