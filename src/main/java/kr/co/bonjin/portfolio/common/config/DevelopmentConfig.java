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
            gigas.addSkill(Skill.builder().title("Java").progress(100).build());
            gigas.addSkill(Skill.builder().title("Spring Framework(Boot)").progress(100).build());
            gigas.addSkill(Skill.builder().title("Swift").progress(100).build());
            gigas.addSkill(Skill.builder().title("Flutter").progress(100).build());
            gigas.addSkill(Skill.builder().title("SQL").progress(100).build());
            gigas.addSkill(Skill.builder().title("HTML5/CSS3").progress(100).build());
            gigas.addSkill(Skill.builder().title("JavaScript").progress(100).build());
            gigas.addSkill(Skill.builder().title("PhotoShop").progress(100).build());
            memberService.save(gigas);

            Member bonjin = new Member("BONJIN", "http://gigas.synology.me/portfolio/images/bonjin/logo.png");
            memberService.save(bonjin);


            // Work
            List workList1 = new ArrayList<>();
            workList1.add("Design");
            workList1.add("HTML5/CSS3");
            workList1.add("JavaScript(Jquery)");
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
            workList2.add("Java");
            workList2.add("Spring Framework(Boot)");
            workList2.add("RESTful");
            workList2.add("Kotlin");
            workList2.add("Open API");
            Work work2 = Work.builder()
                    .name("제주 생활방언")
                    .content("It is a dialect that originated in Jeju Island for a long time.")
                    .image("http://gigas.synology.me/portfolio/images/bonjin-work-01.png")
                    .site("https://play.google.com/store/apps/details?id=com.bonjin.B04")
                    .language(workList2)
                    .type(WorkType.APP)
                    .build();
            workService.save(work2);

            List workList3 = new ArrayList<>();
            workList3.add("Java");
            workList3.add("Spring Framework(Boot)");
            workList3.add("Security");
            workList3.add("JPA");
            workList3.add("H2/MariaDB");
            workList3.add("HTML5/CSS3");
            workList3.add("Bootstrap");
            workList3.add("JavaScript(Jquery)");
            Work work3 = Work.builder()
                    .name("아이돌 관리자")
                    .content("This site manages idol information.")
                    .image("http://gigas.synology.me/portfolio/images/work/idol.png")
                    .site("http://gigas.synology.me:9091")
                    .language(workList3)
                    .type(WorkType.WEB)
                    .build();
            workService.save(work3);

            List workList4 = new ArrayList<>();
            workList4.add("Dart");
            workList4.add("Flutter");
            workList4.add("Swift");
            workList4.add("Kotlin");
            workList4.add("Open API");
            Work work4 = Work.builder()
                    .name("제줏말싸미")
                    .content("It is an app that provides users with information related to the Jeju language, such as living dialects and proverbs of Jeju Island, and live mermaids.")
                    .image("http://gigas.synology.me/portfolio/images/work/jeju_dialect.png")
                    .site("https://play.google.com/store/apps/details?id=kr.co.bonjin.jejudialect")
                    .language(workList4)
                    .type(WorkType.APP)
                    .build();
            workService.save(work4);


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

