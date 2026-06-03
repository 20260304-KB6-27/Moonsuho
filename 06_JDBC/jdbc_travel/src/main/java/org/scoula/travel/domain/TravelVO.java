package org.scoula.travel.domain;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/* 필드명을 csv와 동일하게 지정*/
public class TravelVO {
    private Long no;
    private String district;
    private String title;
    private String description;
    private String address;
    private String phone;
}
