package com.example.springboot_3_daily_devotional.services;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springboot_3_daily_devotional.model.Devotional;
import com.example.springboot_3_daily_devotional.repositories.DevotionalRepository;

@Service
@AllArgsConstructor
public class DevotionalService {

    private final DevotionalRepository devotionalRepository;

    public Optional<Devotional> getDaily() {
        LocalDate today = LocalDate.now();
        return devotionalRepository.findByPublishedAt(today);
    }
}
