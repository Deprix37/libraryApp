package dev.patika.LibraryApp.repository;

import dev.patika.LibraryApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
