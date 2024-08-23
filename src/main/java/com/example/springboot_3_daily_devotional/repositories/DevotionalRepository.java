package com.example.springboot_3_daily_devotional.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DevotionalRepository extends JpaRepository<Devotional, Long> {
    Optional<Devotional> findByPublishedAt(LocalDate date);
}
