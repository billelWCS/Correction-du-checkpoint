package com.example.demo.services;

import com.example.demo.models.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments ();
    Comment getById (Long id);
    Comment createComment(Comment comment);
}
