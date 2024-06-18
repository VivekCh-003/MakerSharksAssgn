package com.example.MakerSharksAssgn.service;

import com.example.MakerSharksAssgn.entity.User;
import com.example.MakerSharksAssgn.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> fetchUser(String username) {
        return userRepository.findByUsername(username);
    }
}
