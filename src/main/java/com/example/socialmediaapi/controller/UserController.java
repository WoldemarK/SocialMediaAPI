package com.example.socialmediaapi.controller;

import com.example.socialmediaapi.model.Post;
import com.example.socialmediaapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
@RequestMapping("users/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/anp/{id_user}")
    public ResponseEntity<Post> addingNewPost(@PathVariable(name = "id_user") Long id_user, @RequestBody Post post) {
        return new ResponseEntity<>(userService.addingNewPost(id_user, post), HttpStatus.ACCEPTED);
    }

//    @GetMapping("/test/{user_id}")
//   // @RequestMapping(value="/test/{user_id}", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
//    ResponseEntity<List<Post>> get(@PathVariable(name = "user_id") Long user_id) {
//        return new ResponseEntity<>(userService.viewPostsByOtherUsers(user_id), HttpStatus.OK);
//    }

//    @GetMapping("/test/{user_id}")
//    ResponseEntity<List<PostDot>> get(@PathVariable(name = "user_id") Long user_id) {
//        return new ResponseEntity<>(userService.viewPostsByOtherUsers(user_id), HttpStatus.OK);
//    }
}
