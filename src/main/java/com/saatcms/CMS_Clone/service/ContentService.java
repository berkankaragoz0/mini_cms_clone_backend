package com.saatcms.CMS_Clone.service;

import com.saatcms.CMS_Clone.da.ContentDto;

import java.util.List;

public interface ContentService {

    ContentDto save(ContentDto contentDto);

    void delete(Long id);

    List<ContentDto> getAll();
}
