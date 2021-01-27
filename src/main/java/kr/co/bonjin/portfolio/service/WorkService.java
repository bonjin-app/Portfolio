package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.dto.WorkResponseDto;

import java.util.List;

public interface WorkService {

    /**
     * Work 전체 조회
     * @return
     */
    List<WorkResponseDto> findAll();
}
