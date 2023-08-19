package com.example.socialmediaapi.service;

import com.example.socialmediaapi.model.Post;
import com.example.socialmediaapi.model.User;
import com.example.socialmediaapi.repository.PostRepository;
import com.example.socialmediaapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;

    private final PostRepository postRepository;


    @Transactional
    public Post addingNewPost(Long id_user, Post post) {
        User user = userRepository.findById(id_user).get();
        user.addingPost(post);
        post.setUser(user);
        return postRepository.save(post);
    }

    //    public List<Post> viewPostsByOtherUsers(Long user_id) {
//        return postRepository.getAllPostUserId(user_id);
//    }
//    public List<PostDot> viewPostsByOtherUsers(Long user_id) {
//        return postRepository.getAllPostUserId(user_id)
//                .stream()
//                .map(mapperPost::mapToPost)
//                .collect(Collectors.toList());
//    }


}

