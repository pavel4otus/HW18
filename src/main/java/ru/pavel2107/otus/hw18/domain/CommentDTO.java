package ru.pavel2107.otus.hw18.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class CommentDTO {
   @Getter @Setter private Long idBook;
   @Getter @Setter private String name;
   @Getter @Setter private String comment;
}
