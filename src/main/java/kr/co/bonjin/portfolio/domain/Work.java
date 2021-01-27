package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "work")
public class Work extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private Long id;

    // 타입
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private WorkType type;

    // 이름
    @Column(name = "name")
    private String name;

    // 내용
    @Column(name = "content")
    private String content;

    // 이미지 주소
    @Column(name = "image")
    private String image;

    // 사이트
    @Column(name = "site")
    private String site;
}
