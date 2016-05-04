package com.mjurinic.controllers;

import com.mjurinic.models.User;
import com.mjurinic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mjurinic on 03.05.16..
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public ResponseEntity getUser(@PathVariable int userId) {
        User user = userRepository.findOne(userId);

        return user != null ? new ResponseEntity(user, HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
