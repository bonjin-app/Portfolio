package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@ToString
@Table(name = "member")
public class Member extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "image")
    private String image;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Collection<Work> works = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "member")
    @JoinColumn(name = "member_id")
    private Reply reply;

    protected Member() {}

    public Member(String name, String image) {
        this.name = name;
        this.image = image;
    }

    //==연관관계 메서드==//
    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
}
