package com.saatcms.CMS_Clone.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class ContentDto {
    private Long id;

    private String name;

    private String status;

    private String posterurl;

    private String videourl;

}
