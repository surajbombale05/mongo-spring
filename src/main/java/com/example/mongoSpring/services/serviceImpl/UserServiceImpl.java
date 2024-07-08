package com.example.mongoSpring.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.openssl.pem_password_cb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongoSpring.model.User;
import com.example.mongoSpring.repository.UserRepo;
import com.example.mongoSpring.services.UserServices;



@Service
public class UserServiceImpl implements UserServices {
 
   
   private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    public List<User> getAllUsers() {
            return userRepo.findAll();
    }

   @Override
    public User saveUser(User user){
        return userRepo.save(user);
    }
}
