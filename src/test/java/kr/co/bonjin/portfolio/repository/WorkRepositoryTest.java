package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.domain.WorkType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class WorkRepositoryTest {

    @Autowired
    WorkRepository workRepository;

    @Test
    @DisplayName("Work Find All")
    public void loadWork() {
        //given
        int maxSize = 10;
        IntStream.rangeClosed(1, maxSize)
                .forEach(e -> {
                    Work work = Work.builder()
                            .name("Work" + e)
                            .content("Content" + e)
                            .type(e % 2 == 0 ? WorkType.APP : WorkType.WEB)
                            .build();
                    workRepository.save(work);
                });

        //when
        List<Work> all = workRepository.findAll();

        //then
        assertEquals(maxSize, all.size(),
                "Work 10건을 생성했는데 전제 조회 했을시 10건이 맞는지 확인.");

        assertEquals(all.size()/2, all.stream().filter(f -> f.getType() == WorkType.WEB).count(),
                "APP 타입으로 5건 생성했는데 일치한지 확인.");
    }

    @Test
    @DisplayName("Wrok Save")
    public void save() {
        //given
        Work work = Work.builder()
                .name("Work")
                .content("Content")
                .type(WorkType.WEB)
                .build();

        //when
        workRepository.save(work);
        Work getWork = workRepository.findOne(work.getId());

        //then
        assertEquals(work, getWork);
    }
}