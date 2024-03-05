package dev.patika.LibraryApp.repository;

import dev.patika.LibraryApp.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
