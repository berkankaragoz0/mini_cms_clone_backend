package com.saatcms.CMS_Clone.service;

import com.saatcms.CMS_Clone.pojo.LicenseDto;

import java.util.List;

public interface LicenseService {

    LicenseDto save(LicenseDto licenseDto);

    void delete(Long id);

    List<LicenseDto> getAll();

}
