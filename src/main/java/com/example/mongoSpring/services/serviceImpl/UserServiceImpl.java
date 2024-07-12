package com.example.mongoSpring.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongoSpring.model.User;
import com.example.mongoSpring.repository.UserRepo;
import com.example.mongoSpring.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User saveUser(User user) {
        if (user.getPassword().equals(user.getReEnterPassword())) {
            return userRepo.save(user);
        } else {
             throw new IllegalArgumentException("Passwords do not match");
        }
    }

    @Override
    public User updateUserById(User user, String id) {
        if (userRepo.existsById(id)) {
            user.setId(id);
            return userRepo.save(user);
        }
        return null;
    }

    @Override
    public void deleteUserById(String id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        }
    }
    public User findUserById(String id){
          return userRepo.findById(id).orElse(null);
    }

  
}
