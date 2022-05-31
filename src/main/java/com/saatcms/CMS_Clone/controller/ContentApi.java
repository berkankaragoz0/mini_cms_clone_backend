package com.saatcms.CMS_Clone.controller;

import com.saatcms.CMS_Clone.da.ContentDto;
import com.saatcms.CMS_Clone.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentApi {

    private final ContentService contentService;

    @PostMapping
    public ResponseEntity<ContentDto> contentSave(@RequestBody ContentDto contentDto) {
        return ResponseEntity.ok(contentService.save(contentDto));
    }

    @GetMapping
    public ResponseEntity<List<ContentDto>> allContentList() {
        return ResponseEntity.ok(contentService.getAll());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        contentService.delete(id);
    }
}
