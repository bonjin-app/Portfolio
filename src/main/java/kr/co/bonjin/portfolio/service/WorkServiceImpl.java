package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.dto.WorkResponseDto;
import kr.co.bonjin.portfolio.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class WorkServiceImpl implements WorkService {

    private final WorkRepository workRepository;

    @Override
    public List<WorkResponseDto> findAll() {
        List<Work> works = workRepository.findAll();

        List<WorkResponseDto> result = works.stream()
                .map(WorkResponseDto::new)
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public WorkResponseDto findOne(Long id) {
        Work work = workRepository.findOne(id);
        WorkResponseDto result = new WorkResponseDto(work);
        return result;
    }

    @Transactional
    @Override
    public Long save(Work work) {
        workRepository.save(work);
        return work.getId();
    }
}
