package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("")
    public ResponseEntity<Post> createPost (@RequestBody Post post){
        return new ResponseEntity<>(
                postService.createPost(post),
                HttpStatus.CREATED
        );
    }

    @GetMapping("")
    public ResponseEntity<List<Post>> getAllPosts (){
        return new ResponseEntity<>(
                postService.getAllPosts(),
                HttpStatus.OK
        );
    }
}
