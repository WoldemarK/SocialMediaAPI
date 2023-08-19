package com.example.socialmediaapi.repository;

import com.example.socialmediaapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(value = "select * from post where user_id = ?", nativeQuery = true)
    List<Post> getAllPostUserId(Long userId);

}
