package dev.patika.LibraryApp.repository;

import dev.patika.LibraryApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
