package com.saatcms.CMS_Clone.service;

import com.saatcms.CMS_Clone.da.ContentDto;
import com.saatcms.CMS_Clone.da.LicenseDto;

import java.util.List;

public interface LicenseService {

    LicenseDto save(LicenseDto licenseDto);

    void delete(Long id);

    List<LicenseDto> getAll();

}
