package com.example.demo.services;

import com.example.demo.models.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();
}
