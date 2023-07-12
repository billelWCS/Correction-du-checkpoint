package com.example.demo.services;

import com.example.demo.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);

    User getUserById(Long id);
    User updateUser(Long id, User user);
    boolean deleteUser (Long id);
}
