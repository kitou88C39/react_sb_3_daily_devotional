package com.example.springboot_3_daily_devotional.controllers;

import com.example.springboot_3_daily_devotional.controllers.*;
import com.example.springboot_3_daily_devotional.services.DevotionalService;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DevotionalController {

    private final DevotionalService devotionalService;

    @GetMapping("devotionals")
    public ResponseEntity<?> getAllDevotinals() {
        List<Devotional> devotionals = devotionalService.getAllDevotions();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("data", devotionals);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("devotionals/daily")
    public ResponseEntity<?> getAllDaily() {
        Optional<Devotional> devotionals = devotionalService.getAllDaily();
        Map<String, Object> map = new HashMap();
        if (devotional.isEmpty()) {
            map.put("status", 404);
            map.put("data", devotionals);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
    }
}
