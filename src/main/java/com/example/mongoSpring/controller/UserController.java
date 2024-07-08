package com.example.mongoSpring.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoSpring.model.User;
import com.example.mongoSpring.services.UserServices;



@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserServices userServices;

    

     @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    @GetMapping
    public List<User> getAllUser() {
            return userServices.getAllUsers();
    }

    @PostMapping
    public User AddUser(@RequestBody User user){
        return userServices.saveUser(user);
    }

    @PutMapping
    public String updateUserById(){
        return "Get all users";
    }

    // @DeleteMapping("users")
    // public String deleteUserById(){
    //     return "Get all users";
    // }
}
