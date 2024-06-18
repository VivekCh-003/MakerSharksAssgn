package com.example.MakerSharksAssgn.service;

import com.example.MakerSharksAssgn.entity.User;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);

    Optional<User> fetchUser(String username);
}
