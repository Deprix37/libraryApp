package dev.patika.LibraryApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.LibraryApp.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "birth_date",nullable = false)
    private LocalDate birthDate;
    @Column(name = "country",nullable = false)
    private String country;
    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> bookList;

}
