package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String message;
    private String imageUrl;

    @JsonIgnoreProperties("post")
    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User author;
}
