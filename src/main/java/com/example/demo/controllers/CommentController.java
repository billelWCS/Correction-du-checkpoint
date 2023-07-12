package com.example.demo.controllers;

import com.example.demo.models.Comment;
import com.example.demo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("")
    public ResponseEntity<Comment> createComment (@RequestBody Comment comment){
        return new ResponseEntity<>(
             commentService.createComment(comment),
                HttpStatus.CREATED
        );
    }

}
