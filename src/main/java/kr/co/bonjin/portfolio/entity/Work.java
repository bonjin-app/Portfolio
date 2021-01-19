package kr.co.bonjin.portfolio.entity;

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
    private Long id;

    // 타입

    // 이름
    @Column(name = "name")
    private String name;

    // 내용
    @Column(name = "content")
    private String content;

    // 사이트
    @Column(name = "site")
    private String site;
}
