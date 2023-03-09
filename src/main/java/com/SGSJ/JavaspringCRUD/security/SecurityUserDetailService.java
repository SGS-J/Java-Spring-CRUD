package com.SGSJ.JavaspringCRUD.security;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import com.SGSJ.JavaspringCRUD.domain.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SecurityUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.getByEmail(username);
        return (UserDetails) user.get();
    }
}
