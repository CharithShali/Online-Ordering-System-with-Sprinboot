package com.E052.db.client.service;


import com.E052.db.client.dto.UserRegistrationDto;
import com.E052.db.client.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}