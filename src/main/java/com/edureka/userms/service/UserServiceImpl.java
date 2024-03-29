package com.edureka.userms.service;

import com.edureka.userms.model.User;
import com.edureka.userms.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        LOGGER.info("### Getting all users");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getSingleUser(Long userId) {
        LOGGER.info("### Getting single user");
        return userRepository.findById(userId);
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public Object getAllOrders() {
        return null;
    }
}
