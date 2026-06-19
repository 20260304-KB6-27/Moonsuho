package org.scoula.domain;

import lombok.*;

import java.util.Date;


/// Mybatis 진영에서의 VO -> DB테이블의 한 행에 매핑되는 객체
@Data // @Getter @Setter @EqualsAndHashCode @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {
    private Long no;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;
}
