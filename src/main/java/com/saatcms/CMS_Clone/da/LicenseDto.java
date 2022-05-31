package com.saatcms.CMS_Clone.da;

import com.saatcms.CMS_Clone.model.Content;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class LicenseDto {
    private Long id;
    private String name;
    private String start_time;
    private String end_time;
}
