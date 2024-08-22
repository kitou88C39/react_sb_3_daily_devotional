package com.example.springboot_3_daily_devotional.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devotinal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String quote;

    String author;

    String imagePath;

    @Column(columnDefinition = "TEXT")
    String content;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
