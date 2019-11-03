package com.edureka.userms.resource;

import com.edureka.userms.model.User;
import com.edureka.userms.service.UserService;
import com.edureka.userms.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    
    @GetMapping("/status")
    public String status() {
        LOGGER.info("$$$ Status check ");
        return "All Good";
    }
    
    @GetMapping("/users")
    public ResponseEntity getAllUsers() {
        LOGGER.info("$$$ Getting all users");
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity getSingleUser(@PathVariable Long userId) {
        LOGGER.info("$$$ Getting single user");
        final Optional<User> singleUser = userService.getSingleUser(userId);
        if(!singleUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(singleUser.get());
    }
}
