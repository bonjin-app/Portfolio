package kr.co.bonjin.portfolio.common.config;

import com.sun.tools.javac.util.List;
import kr.co.bonjin.portfolio.domain.Member;
import kr.co.bonjin.portfolio.domain.Reply;
import kr.co.bonjin.portfolio.domain.Work;
import kr.co.bonjin.portfolio.domain.WorkType;
import kr.co.bonjin.portfolio.service.MemberService;
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
    public CommandLineRunner dataLoader(MemberService memberService,
                                        WorkService workService,
                                        ReplyService replyService) {
        return args -> {

            Member member = Member.builder()
                    .name("GIGAS")
                    .image("http://gigas.synology.me/portfolio/images/man-profile-512x512.png")
                    .build();
            memberService.save(member);

            Work work1 = Work.builder()
                    .name("Genius CHOI")
                    .content("This is my first portfolio.")
                    .image("http://gigas.synology.me/portfolio/images/work/geniuschoi.png")
                    .site("http://gigas.synology.me:7070/geniuschoi")
                    .language(List.of("Design","Xml", "Java", "Kotlin"))
                    .type(WorkType.WEB)
                    .build();
            workService.save(work1);

            Work work2 = Work.builder()
                    .name("제주 생활방언")
                    .content("It is a dialect that originated in Jeju Island for a long time.")
                    .image("http://gigas.synology.me/portfolio/images/bonjin-work-01.png")
                    .site("https://play.google.com/store/apps/details?id=com.bonjin.B04")
                    .language(List.of("HTML5","CSS3", "JavaScript", "Jquery"))
                    .type(WorkType.APP)
                    .build();
            workService.save(work2);

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

