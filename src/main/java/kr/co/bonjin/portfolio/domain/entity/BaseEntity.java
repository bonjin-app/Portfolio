package kr.co.bonjin.portfolio.domain.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * 공통적으로 사용
 */
@Getter
// Jpa Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들(createdDate, modifiedData)도 칼럼으로 인식하도록 설정.
@MappedSuperclass
// BaseTimeEntity 클래스에 Auditing 기능을 포함.
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    // Entity가 생성되어 저장될 때 시간이 자동 저장.
    @CreatedDate
    @Column(name="created_date", updatable = false)
    private LocalDateTime createdDate;

    // Entity의 값을 변경할 때 시간이 자동 저장.
    @LastModifiedDate
    @Column(name="modified_date")
    private LocalDateTime modifiedDate;
}
