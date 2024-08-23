package com.example.springboot_3_daily_devotional.services;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public List<Devotional> getAllDevotions() {
        return devotionalRepository.findAll();
    }

    public Devotional save(Devotional devotional) {
        if (devotional.getId() == null) {
            devotional.setCreatedAt(LocalDateTime.now());
        }
        devotional.setUpdatedAt(LocalDateTime.now());
        return devotionalRepository.save(devotional);
    }
}
