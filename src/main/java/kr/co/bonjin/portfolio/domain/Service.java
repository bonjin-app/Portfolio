package kr.co.bonjin.portfolio.domain;

import kr.co.bonjin.portfolio.converter.StringListConverter;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "service")
public class Service extends BaseEntity {

    // 순번
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long id;

    // 아이콘
    @Column(name = "icon")
    private String icon;

    // 타이틀
    @Column(name = "title")
    private String title;

    // 내용
    @Column(name = "content")
    private String conten;

    // 항목
    @Column(name = "items")
    @Convert(converter = StringListConverter.class)
    private List<String> items;

}
