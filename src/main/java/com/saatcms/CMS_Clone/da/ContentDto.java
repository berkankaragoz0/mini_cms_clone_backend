package com.saatcms.CMS_Clone.da;

import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;

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
