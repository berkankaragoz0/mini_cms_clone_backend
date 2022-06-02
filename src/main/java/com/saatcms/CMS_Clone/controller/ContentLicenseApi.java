/*package com.saatcms.CMS_Clone.controller;

import com.saatcms.CMS_Clone.pojo.ContentDto;
import com.saatcms.CMS_Clone.pojo.ContentLicenseP;
import com.saatcms.CMS_Clone.service.ContentLicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contentLicense")
@RequiredArgsConstructor
public class ContentLicenseApi {
    private final ContentLicenseService contentLicenseService;

    @PostMapping
    public ResponseEntity<ContentLicenseP> contentLicenseSave(@RequestBody ContentLicenseP contentLicenseP) {
        return ResponseEntity.ok(contentLicenseService.save(contentLicenseP));
    }
}
*/