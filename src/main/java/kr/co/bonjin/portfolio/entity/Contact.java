package kr.co.bonjin.portfolio.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "contact")
public class Contact {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 이름
    @Column(name = "name")
    private String name;

    // 이메일
    @Column(name = "email")
    private String email;

    // 제목
    @Column(name = "subject")
    private String subject;

    // 내용
    @Column(name = "message")
    private String message;
}
