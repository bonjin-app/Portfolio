package kr.co.bonjin.portfolio.common.config;

import kr.co.bonjin.portfolio.domain.*;
import kr.co.bonjin.portfolio.service.MemberService;
import kr.co.bonjin.portfolio.service.ReplyService;
import kr.co.bonjin.portfolio.service.ServiceService;
import kr.co.bonjin.portfolio.service.WorkService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Profile("!real")
@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(MemberService memberService,
                                        WorkService workService,
                                        ReplyService replyService,
                                        ServiceService serviceService) {
        return args -> {

            // Member
            Member gigas = new Member("GIGAS", "http://gigas.synology.me/portfolio/images/man-profile-512x512.png");
            memberService.save(gigas);

            Member bonjin = new Member("BONJIN", "http://gigas.synology.me/portfolio/images/bonjin/logo.png");
            memberService.save(bonjin);

            // Work
            List workList1 = new ArrayList<>();
            workList1.add("Design");
            workList1.add("Xml");
            workList1.add("Java");
            workList1.add("Kotlin");
            Work work1 = Work.builder()
                    .name("Genius CHOI")
                    .content("This is my first portfolio.")
                    .image("http://gigas.synology.me/portfolio/images/work/geniuschoi.png")
                    .site("http://gigas.synology.me:7070/geniuschoi")
                    .language(workList1)
                    .type(WorkType.WEB)
                    .build();
            workService.save(work1);

            List workList2 = new ArrayList<>();
            workList2.add("HTML5");
            workList2.add("CSS3");
            workList2.add("JavaScript");
            workList2.add("Jquery");
            Work work2 = Work.builder()
                    .name("제주 생활방언")
                    .content("It is a dialect that originated in Jeju Island for a long time.")
                    .image("http://gigas.synology.me/portfolio/images/bonjin-work-01.png")
                    .site("https://play.google.com/store/apps/details?id=com.bonjin.B04")
                    .language(workList2)
                    .type(WorkType.APP)
                    .build();
            workService.save(work2);


            // Reply
            Reply reply1 = new Reply("Will you study for life?");
            reply1.setMember(gigas);
            replyService.save(reply1);

            Reply reply2 = new Reply("Team to develop while having fun.");
            reply2.setMember(bonjin);
            replyService.save(reply2);

            // Service
            List sList1 = new ArrayList<>();
            sList1.add("Per User Permissions");
            sList1.add("Communication encryption");
            sList1.add("Personal information security");
            Service service1 = Service.builder()
                    .title("Security")
                    .conten("Strict security system.")
                    .icon("la-shield-alt")
                    .items(sList1)
                    .build();
            serviceService.save(service1);

            List sList2 = new ArrayList<>();
            sList2.add("Simple operation");
            Service service2 = Service.builder()
                    .title("Mobile Applications")
                    .conten("Mobile convenience features.")
                    .icon("la-mobile")
                    .items(sList2)
                    .build();
            serviceService.save(service2);

            List sList3 = new ArrayList<>();
            sList3.add("Easy to see UI UX");
            sList3.add("Preferred design");
            Service service3 = Service.builder()
                    .title("UX & UI Design")
                    .conten("Neat design.")
                    .icon("la-image")
                    .items(sList3)
                    .build();
            serviceService.save(service3);

            List sList4 = new ArrayList<>();
            sList4.add("Smooth movement");
            Service service4 = Service.builder()
                    .title("Light")
                    .conten("Fast and light.")
                    .icon("la-feather-alt")
                    .items(sList4)
                    .build();
            serviceService.save(service4);
        };
    }
}

