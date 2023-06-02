package com.lgypro.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class AttachController {
    @GetMapping("/attack")
    public String attack(@RequestParam(value = "url", required = false) String url) throws IOException {
        if (url != null && !url.isBlank()) {
            Resource resource = new UrlResource(url);
            return new String(resource.getContentAsByteArray(), StandardCharsets.UTF_8);
        }
        return "";
    }
}
