package ru.pavel2107.otus.hw18.service;

import ru.pavel2107.otus.hw18.domain.Comment;

import java.util.List;

public interface CommentService {
    Comment save(Comment comment);
    Comment find( Long Id);
    List<Comment> findAll(Long bookId);
}
