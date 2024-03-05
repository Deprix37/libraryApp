package dev.patika.LibraryApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.LibraryApp.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {
    @Column(name = "name" , nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    private List<Book> bookList;
}
