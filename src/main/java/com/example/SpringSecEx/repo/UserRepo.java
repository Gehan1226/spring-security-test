package com.example.SpringSecEx.repo;

import com.example.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUserName(String userName);
}
