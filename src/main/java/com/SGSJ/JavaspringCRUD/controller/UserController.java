package com.SGSJ.JavaspringCRUD.controller;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import com.SGSJ.JavaspringCRUD.domain.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/all")
    public List<User> getAllUsers() {
       return userRepo.getAll();
    }

    @GetMapping("/allorder")
    public List<User> getAllUsersOrdered() {
        return userRepo.getAllOrdered();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
       Optional<User> user = userRepo.getById(userId);
       if(user == null) {
           return new User();
       } else {
           return user.get();
       }
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteUser(@PathVariable Long userId){
       userRepo.delete(userId);
    }

    @PutMapping("update/{userId}")
    public User updateUserById(@RequestBody User user, @PathVariable Long userId) {
        return userRepo.update(user, userId);
    }

}
