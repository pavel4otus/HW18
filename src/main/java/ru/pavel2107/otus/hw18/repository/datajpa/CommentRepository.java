package ru.pavel2107.otus.hw18.repository.datajpa;

import org.springframework.data.repository.CrudRepository;
import ru.pavel2107.otus.hw18.domain.Comment;

import java.util.List;


public interface CommentRepository extends CrudRepository<Comment, Long> {
    public List<Comment> findByBookId(Long ID);
}
