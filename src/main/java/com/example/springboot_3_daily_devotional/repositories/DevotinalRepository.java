package com.example.springboot_3_daily_devotional.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DevotinalRepository extends JpaRepository<Devotinal, Long> {
    Optinal<Devotinal> findByPublishedAt(LocalDate date);
}
