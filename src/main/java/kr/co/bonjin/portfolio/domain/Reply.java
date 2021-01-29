package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(exclude = "member")
@Table(name = "reply")
public class Reply extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private Long id;

    // 내용
    @Column(name = "content")
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    private Member member;

    protected Reply() {}

    public Reply(String content) {
        this.content = content;
    }

    //==연관관계 메서드==//
    public void setMember(Member member) {
        this.member = member;
        member.setReply(this);
    }
}
