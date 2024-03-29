package com.SGSJ.JavaspringCRUD.controller;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import com.SGSJ.JavaspringCRUD.domain.User.UserRepository;
import com.SGSJ.JavaspringCRUD.security.SecurityUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
        return user.orElseGet(User::new);
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId, @RequestBody String userName) {
       userRepo.delete(userId);
       return "User " + userName + " deleted!";
    }

    @PutMapping("/{userId}")
    public User updateUserById(@RequestBody User user, @PathVariable Long userId) {
        return userRepo.update(user, userId);
    }
}
