package com.example.SpringSecEx.service;

import com.example.SpringSecEx.model.UserPrincipal;
import com.example.SpringSecEx.model.Users;
import com.example.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Users users = repo.findByUserName(username);
        if (users == null){
            throw new UsernameNotFoundException("User not found !");
        }
        return new UserPrincipal(users);
    }
}
