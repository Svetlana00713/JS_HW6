package com.example.JS_HW6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
public class Note {
    public enum Status {TASK, REMINDER, INFORMATION}               // Статус заметки.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)                                      // Поле не может иметь значение null.
    private Status status;                                         // Статус выполнения задачи.
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column
    private LocalDateTime local_date_time = LocalDateTime.now();
}
