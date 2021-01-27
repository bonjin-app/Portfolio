package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.dto.WorkResponseDto;

import java.util.List;

public interface WorkService {

    /**
     * Work 전체 조회
     * @return
     */
    List<WorkResponseDto> findAll();

    /**
     * Work 저장
     * @param work
     * @return
     */
    Long save(Work work);

    /**
     * Work 단건 조회
     * @param id
     * @return
     */
    WorkResponseDto findOne(Long id);
}
