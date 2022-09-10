package com.lwl.taxpoc.service;


import com.lwl.taxpoc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {



    private List<User> users=new ArrayList<>();
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.add(user);
    }
    public Optional<User> findByUsername(String username) {
        return users.stream().filter(u->u.getUsername().equals(username)).findAny();
    }
}
