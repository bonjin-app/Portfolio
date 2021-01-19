package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
