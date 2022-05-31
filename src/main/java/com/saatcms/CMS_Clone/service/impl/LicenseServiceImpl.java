package com.saatcms.CMS_Clone.service.impl;

import com.saatcms.CMS_Clone.pojo.LicenseDto;
import com.saatcms.CMS_Clone.model.License;
import com.saatcms.CMS_Clone.repo.LicenseRepository;
import com.saatcms.CMS_Clone.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LicenseServiceImpl implements LicenseService {

    private final LicenseRepository licenseRepository;

    @Override
    public LicenseDto save(LicenseDto licenseDto) {
        License license = new License();
        license.setName(licenseDto.getName());
        license.setStart_time(licenseDto.getStart_time());
        license.setEnd_time(licenseDto.getEnd_time());

        final License licenseDb = licenseRepository.save(license);
        licenseDto.setId(licenseDb.getId());
        return licenseDto;
    }

    @Override
    public void delete(Long id) {
        licenseRepository.deleteById(id);
    }

    @Override
    public List<LicenseDto> getAll() {
        List<License> licenses = licenseRepository.findAll();
        List<LicenseDto> licenseDtos = new ArrayList<>();

        licenses.forEach(it -> {
            LicenseDto licenseDto =new LicenseDto();
            licenseDto.setId(it.getId());
            licenseDto.setName(it.getName());
            licenseDto.setStart_time(it.getStart_time());
            licenseDto.setEnd_time(it.getEnd_time());
            licenseDtos.add(licenseDto);
        });
        return licenseDtos;
    }
}
