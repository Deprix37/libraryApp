package dev.patika.LibraryApp.entity;

import dev.patika.LibraryApp.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing extends BaseEntity {
   @Column(name = "borrower_name",nullable = false)
    private String borrowername;
   @Column(name = "borrowing_date")
    private LocalDate borrowingDate;
   @Column(name = "return_date")
    private LocalDate returnDate;
    @ManyToOne
    @JoinColumn(name ="book_id",referencedColumnName = "id")
    private Book book;


}
