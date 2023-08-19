package com.example.socialmediaapi.service;

import com.example.socialmediaapi.model.Post;
import com.example.socialmediaapi.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
public class PostService  {

    private final PostRepository postRepository;

    public Post createPost(@Validated Post post) {
      return  postRepository.save(post);
    }


}