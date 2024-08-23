package com.example.springboot_3_daily_devotional.controllers;

import com.example.springboot_3_daily_devotional.controllers.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DevotionalController {

    private final DevotionalService devotionalService;

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
