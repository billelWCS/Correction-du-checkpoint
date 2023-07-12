package com.example.demo.servicesImplem;

import com.example.demo.models.Comment;
import com.example.demo.models.Post;
import com.example.demo.repositories.CommentRepository;
import com.example.demo.repositories.PostRepository;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostImplem implements PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    CommentRepository commentRepository;

    @Override
    public Post createPost(Post post) {
        Post newPost = postRepository.save(post);

        for (Comment comment : post.getComments()){
            comment.setPost(newPost);
            commentRepository.save(comment);
        }
        return newPost;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
