package com.example.mongoSpring.services;

import java.util.List;

import com.example.mongoSpring.model.User;

public interface UserServices {
    public List<User> getAllUsers();
    public User saveUser(User user);
    public User updateUserById(User user,String id);
    public void deleteUserById(String id);
}
