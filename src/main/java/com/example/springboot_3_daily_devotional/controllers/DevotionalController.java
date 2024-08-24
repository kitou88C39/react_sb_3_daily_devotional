package com.example.springboot_3_daily_devotional.controllers;

import com.example.springboot_3_daily_devotional.controllers.*;
import com.example.springboot_3_daily_devotional.model.Devotional;
import com.example.springboot_3_daily_devotional.services.DevotionalService;

import lombok.AllArgsConstructor;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DevotionalController {

    private final DevotionalService devotionalService;

    @GetMapping("devotionals")
    public ResponseEntity<?> getAllDevotionals() {
        List<Devotional> devotionals = devotionalService.getAllDevotions();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", devotionals);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("devotionals/daily")
    public ResponseEntity<?> getDaily() {
        Optional<Devotional> devotionals = devotionalService.getDaily();
        Map<String, Object> map = new HashMap();
        if (devotional.isEmpty()) {
            map.put("status", 404);
            map.put("data", null);
        } else {
            map.put("status", 200);
            map.put("data", devotional.get());
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
