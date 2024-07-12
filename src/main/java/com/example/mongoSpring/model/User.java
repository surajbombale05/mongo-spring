package com.example.mongoSpring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Data
@Document(collection = "newUser")
public class User{
    @Id
    private String id;
    private String userName;
    private String email;
    private String password;
    private String reEnterPassword;
}