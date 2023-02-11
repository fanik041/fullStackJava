package com.example.myPhotoAppp.repository;

import com.example.myPhotoAppp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    public User getUser(){
        User user = new User("fahim", "canada", 26);
        return user;
    }

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }
}
