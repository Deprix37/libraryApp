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

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publisher extends BaseEntity {
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "establishment_year",nullable = false)
    private int establishmentYear;
    @Column(name = "adress",nullable = false)
    private String address;

    @OneToMany(mappedBy = "publisher")
    @JsonIgnore
    private List<Book> book;

}
