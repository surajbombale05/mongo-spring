package com.example.mongoSpring.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoSpring.model.User;

public interface UserRepo extends MongoRepository<User, String>{
}
