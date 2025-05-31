package com.example.springreact.controller;

import com.example.springreact.entity.User;
import com.example.springreact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController{
@Autowired
UserService userService;
@GetMapping("/user")
public List<User> getUsers(){
    return userService.getUsers();
}
@GetMapping("/{id}")
public User getOne(@PathVariable String id){
    return userService.getOne(id);
}
@PostMapping("/users")
    public User postUser(@RequestBody User user){
    return userService.postUser(user);
}
}