package com.example.springreact.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springreact.entity.User;
import java.util.Optional;


public interface UserRepository extends MongoRepository<User, String> {

}