package kr.co.bonjin.portfolio.service;

import kr.co.bonjin.portfolio.dto.ServiceResponseDto;
import kr.co.bonjin.portfolio.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Transactional
    @Override
    public List<ServiceResponseDto> findAll() {
        List<kr.co.bonjin.portfolio.domain.Service> services = serviceRepository.findAll();

        List<ServiceResponseDto> result = services.stream()
                .map(ServiceResponseDto::new)
                .collect(Collectors.toList());

        return result;
    }

    @Transactional
    @Override
    public Long save(kr.co.bonjin.portfolio.domain.Service service) {
        serviceRepository.save(service);
        return service.getId();
    }
}
