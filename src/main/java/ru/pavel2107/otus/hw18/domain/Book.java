package ru.pavel2107.otus.hw18.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "books")
@NoArgsConstructor
@JsonIgnoreProperties( value = { "comments"})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id", nullable = false)
    @Setter @Getter private Long id;

    @Column( name = "name")
    @Setter @Getter private String name;

    @ManyToOne
    @JoinColumn( name = "author_id")
    @Setter @Getter private Author author;

    @ManyToOne
    @JoinColumn( name = "genre_id")
    @Setter @Getter private Genre genre;

    @Column( name = "pub_house")
    @Setter @Getter private String    publishingHouse;

    @Column( name = "pub_year")
    @Setter @Getter private Integer   publicationYear;

    @Column( name = "pub_place")
    @Setter @Getter private String    publicationPlace;

    @Column( name = "isbn")
    @Setter @Getter private String    isbn;


    @OneToMany( mappedBy = "book", fetch = FetchType.LAZY)
    @Setter @Getter private List<Comment> comments;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publicationYear=" + publicationYear +
                ", publicationPlace='" + publicationPlace + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
