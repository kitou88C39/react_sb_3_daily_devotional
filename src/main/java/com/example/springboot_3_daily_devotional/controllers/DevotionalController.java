package com.example.springboot_3_daily_devotional.controllers;

import com.example.springboot_3_daily_devotional.controllers.*;
import com.example.springboot_3_daily_devotional.services.DevotionalService;

import lombok.AllArgsConstructor;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DevotionalController {

    private final DevotionalService devotionalService;

    @GetMapping("evotionals")
    public ResponseEntity<?> getAllDevotinals() {
        List<Devotional> devotionals = devotionalService.getAllDevotions();
        Map<String, Object> map = new HashMap<>();
    }

}
