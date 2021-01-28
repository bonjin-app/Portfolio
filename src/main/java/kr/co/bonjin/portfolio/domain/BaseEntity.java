package kr.co.bonjin.portfolio.domain;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * 공통적으로 사용
 */
@Getter
// Jpa Entity 클래스들이 BaseEntity 상속할 경우 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록 설정.
@MappedSuperclass
abstract class BaseEntity {

    // Entity가 생성되어 저장될 때 시간이 자동 저장.
    @CreationTimestamp
    @Column(name="created_date", updatable = false)
    private LocalDateTime createdDate;

    // Entity의 값을 변경할 때 시간이 자동 저장.
    @UpdateTimestamp
    @Column(name="modified_date")
    private LocalDateTime modifiedDate;
}
