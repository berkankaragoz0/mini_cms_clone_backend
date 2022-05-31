package com.saatcms.CMS_Clone.service.impl;

import com.saatcms.CMS_Clone.model.Content;
import com.saatcms.CMS_Clone.model.ContentLicense;
import com.saatcms.CMS_Clone.pojo.ContentLicenseP;
import com.saatcms.CMS_Clone.repo.ContentLicenseRepository;
import com.saatcms.CMS_Clone.repo.ContentRepository;
import com.saatcms.CMS_Clone.repo.LicenseRepository;
import com.saatcms.CMS_Clone.service.ContentLicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentLicenseServiceImpl implements ContentLicenseService {
    private final ContentRepository contentRepository;
    private final LicenseRepository licenseRepository;
    private final ContentLicenseRepository contentLicenseRepository;

    @Override
    @Transactional
    public ContentLicenseP save(ContentLicenseP contentLicenseP) {
        ContentLicense contentLicense = new ContentLicense();
        contentLicense.setContent_id(contentLicenseP.getContent_id());
        contentLicense.setLicense_id(contentLicenseP.getLicense_id());

        final ContentLicense contentLicenseDb = contentLicenseRepository.save(contentLicense);
        contentLicenseP.setContent_id(contentLicenseDb.getContent_id());
        //contentLicenseP.setLicense_id(contentLicenseDb.getLicense_id());
        return contentLicenseP;
    }

    @Override
    public void delete(Long content_id, Long license_id) {

    }

    @Override
    public List<ContentLicenseP> getAll() {
        return null;
    }
}
