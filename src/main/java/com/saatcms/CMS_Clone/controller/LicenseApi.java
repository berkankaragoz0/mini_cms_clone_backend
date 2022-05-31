package com.saatcms.CMS_Clone.controller;

import com.saatcms.CMS_Clone.pojo.LicenseDto;
import com.saatcms.CMS_Clone.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/license")
@RequiredArgsConstructor
public class LicenseApi {
    private final LicenseService licenseService;

    @PostMapping
    public ResponseEntity<LicenseDto> licenseSave(@RequestBody LicenseDto licenseDto) {
        return ResponseEntity.ok(licenseService.save(licenseDto));
    }

    @GetMapping
    public ResponseEntity<List<LicenseDto>> allLicenseList() {
        return ResponseEntity.ok(licenseService.getAll());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        licenseService.delete(id);
    }
}
