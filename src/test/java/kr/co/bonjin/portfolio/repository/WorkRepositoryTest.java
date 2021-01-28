package kr.co.bonjin.portfolio.repository;

import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.domain.WorkType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
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
        List<Work> before = workRepository.findAll();
        int maxSize = 10;
        IntStream.rangeClosed(1, maxSize)
                .forEach(e -> {
                    Work work = Work.builder()
                            .name("Work" + e)
                            .content("Content" + e)
                            .image("http://gigas.synology.me/portfolio/images/work_image.jpeg")
                            .type(e % 2 == 0 ? WorkType.APP : WorkType.WEB)
                            .build();
                    workRepository.save(work);
                });

        //when
        List<Work> all = workRepository.findAll();

        //then
        assertEquals(maxSize + before.size(), all.size());
        assertEquals(all.size()/2, all.stream().filter(f -> f.getType() == WorkType.WEB).count());
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