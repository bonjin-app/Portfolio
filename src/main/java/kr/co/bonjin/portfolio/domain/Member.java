package kr.co.bonjin.portfolio.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "member")
public class Member extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Builder.Default
    @OneToMany(mappedBy = "member")
    private List<Skill> skills = new ArrayList<>();

}
