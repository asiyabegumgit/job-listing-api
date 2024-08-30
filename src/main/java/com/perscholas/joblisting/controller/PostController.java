package com.perscholas.joblisting.controller;

import com.perscholas.joblisting.repository.PostRepository;
import com.perscholas.joblisting.model.Post;
import com.perscholas.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PostController
{

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;




    @GetMapping("/posts")

    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")

    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")

    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }


}
