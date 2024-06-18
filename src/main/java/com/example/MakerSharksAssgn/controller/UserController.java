package com.example.MakerSharksAssgn.controller;

import com.example.MakerSharksAssgn.entity.User;
import com.example.MakerSharksAssgn.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User user) {
        try {
            User registeredUser = userService.registerUser(user);
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("User registration failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<?> fetchUser(@RequestParam String username){
        Optional<User> user = userService.fetchUser(username);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }
}
