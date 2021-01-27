package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "reply")
public class Reply extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private Long id;

    // 이름
    @Column(name = "name")
    private String name;

    // 내용
    @Column(name = "content")
    private String content;

    // 이미지 주소
    @Column(name = "image")
    private String image;
}
