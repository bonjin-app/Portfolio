package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tech")
public class Tech extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tech_id")
    private Long id;

    // 이미지
    @Column(name = "image")
    private String image;
}
