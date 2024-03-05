package dev.patika.LibraryApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.LibraryApp.core.BaseEntity;
import jakarta.persistence.*;
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
public class Book extends BaseEntity {
   @Column(name = "name", nullable = false)
    private String name;

   @Column(name = "publication_year",nullable = false)
    private int publicationYear;
    @Column(name = "stock",nullable = false)
    private int stock;

    @ManyToOne()
    @JoinColumn(name = "author_id" , referencedColumnName = "id")
    private Author author;

    @ManyToOne()
    @JoinColumn(name = "publisher_id" , referencedColumnName = "id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categorieList;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<BookBorrowing> bookBorrowingList;


}
