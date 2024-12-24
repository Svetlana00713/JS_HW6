package com.example.JS_HW6.repository;

import com.example.JS_HW6.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    default List<Note> getNoteByStatus() {
        return null;
    }

}
