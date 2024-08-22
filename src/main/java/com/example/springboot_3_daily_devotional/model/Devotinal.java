package com.example.springboot_3_daily_devotional.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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

    LocalDate publishedAt;

    @Override
    public String toString() {
        return String.format(
                "Devotional{id=%d, imagePath='%s', quote='%s', author='%s',content='%s', createDAt='%s', updatedAt='%s', publishedAt='%s',}",
                id, imagePath, quote, author, content, createdAt, updatedAt, publishedAt);
    }
}
