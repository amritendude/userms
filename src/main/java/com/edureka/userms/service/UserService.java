package com.edureka.userms.service;

import com.edureka.userms.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();
    Optional<User> getSingleUser(Long userId);
    void createUser(User user);
    void deleteUser(Long userId);
    void updateUser(User user);
    Object getAllOrders();// another ms call ie orderms
}
