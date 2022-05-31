package com.saatcms.CMS_Clone.service.impl;

import com.saatcms.CMS_Clone.da.ContentDto;
import com.saatcms.CMS_Clone.model.Content;
import com.saatcms.CMS_Clone.model.License;
import com.saatcms.CMS_Clone.repo.ContentRepository;
import com.saatcms.CMS_Clone.repo.LicenseRepository;
import com.saatcms.CMS_Clone.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {

    private final ContentRepository contentRepository;
    private final LicenseRepository licenseRepository;

    @Override
    @Transactional
    public ContentDto save(ContentDto contentDto) {
        Content content = new Content();
        content.setName(contentDto.getName());
        content.setStatus(contentDto.getStatus());
        content.setPosterurl(contentDto.getPosterurl());
        content.setVideourl(contentDto.getVideourl());

        final Content contentDb = contentRepository.save(content);

        contentDto.setId(contentDb.getId());
        return contentDto;
    }

    @Override
    public void delete(Long id) {
        contentRepository.deleteById(id);
    }

    @Override
    public List<ContentDto> getAll() {
        List<Content> contents = contentRepository.findAll();
        List<ContentDto> contentsDtos = new ArrayList<>();

        contents.forEach(it -> {
            ContentDto contentDto =new ContentDto();
            contentDto.setId(it.getId());
            contentDto.setName(it.getName());
            contentDto.setStatus(it.getStatus());
            contentDto.setPosterurl(it.getPosterurl());
            contentDto.setVideourl(it.getVideourl());

            contentsDtos.add(contentDto);
        });
        return contentsDtos;
    }
}
