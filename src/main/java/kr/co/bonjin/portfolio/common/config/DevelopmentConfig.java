package kr.co.bonjin.portfolio.common.config;

import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.domain.WorkType;
import kr.co.bonjin.portfolio.service.ReplyService;
import kr.co.bonjin.portfolio.service.WorkService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!real")
@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(WorkService workService, ReplyService replyService) {
        return args -> {

            Work work1 = Work.builder()
                    .name("Genius CHOI")
                    .content("")
                    .image("http://gigas.synology.me/portfolio/images/work/geniuschoi.png")
                    .type(WorkType.WEB)
                    .build();
            workService.save(work1);

            Reply reply1 = Reply.builder()
                    .name("GIGAS")
                    .content("Will you study for life?")
                    .image("http://gigas.synology.me/portfolio/images/man-profile-512x512.png")
                    .build();
            replyService.save(reply1);

            Reply reply2 = Reply.builder()
                    .name("BONJIN")
                    .content("Team to develop while having fun.")
                    .image("http://gigas.synology.me/portfolio/images/bonjin/logo.png")
                    .build();
            replyService.save(reply2);
        };
    }
}

