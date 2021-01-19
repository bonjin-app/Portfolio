package kr.co.bonjin.portfolio.entity;

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
    private Long id;


}
