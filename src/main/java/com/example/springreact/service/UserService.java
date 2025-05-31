package com.example.springreact.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springreact.entity.User;
import com.example.springreact.repository.UserRepository;

@Service
public class UserService {

    List<User> user = Arrays.asList(new User("1","nsihi0","sjd"),new User("2","kris","kue"));
    public List<User> getUsers(){
        return user;
    };

    @Autowired
    private UserRepository userRepository;


    public User getOne(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);  // or throw exception if not found
    }

    public User postUser(User user) {
        return userRepository.save(user);
    }
}
