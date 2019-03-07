package com.example.MijnInzetBackend.controllers;

import com.example.MijnInzetBackend.models.User;
import com.example.MijnInzetBackend.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class UserController {

    private UserRepository repository;

    @CrossOrigin(origins = "https://oege.ie.hva.nl/~zhengk001")
    @RequestMapping(path = "/api/login", method = RequestMethod.POST)
    public @ResponseBody User login(@RequestParam String username, @RequestParam String password) {
        return new User(username, password);
    }
}
