package com.SGSJ.JavaspringCRUD.controller;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import com.SGSJ.JavaspringCRUD.domain.User.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepo;

    @GetMapping("/")
    public List<User> getAllUsers() {
       return userRepo.getAll();
    }

    @GetMapping("/")
    public List<User> getAllUsersOrdered() {
        return userRepo.getAllOrdered();
    }

    @GetMapping("/:id")
    public User getUserById(@PathVariable long userId) {
       Optional<User> user = userRepo.getById(userId);
       if(user == null) {
           return new User();
       } else {
           return user.get();
       }
    }

    @PostMapping("/")
    public User createUser(User user) {
        return userRepo.save(user);
    }
}
