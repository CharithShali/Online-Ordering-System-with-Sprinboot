package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.CategoryDto;
import com.E052.db.Admin.model.category;
import com.E052.db.client.dto.UserRegistrationDto;
import com.E052.db.client.model.User;
import com.E052.db.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Base64;

@Controller
@RequestMapping("/updateUserdetails/{id}")
public class UpdateUserDetails {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public String returnupdate(Model model, @PathVariable int id){
        model.addAttribute("user",userRepository.getById(id));
        return "updatemydetails";
    }
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping
    public String AddBrand(@ModelAttribute("user") UserRegistrationDto registrationDto, @PathVariable int id)
    {

        User user;
        user=userRepository.getById(id);
        user.setEmail(registrationDto.getEmail());
        user.setFirstName(registrationDto.getFirstName());
        user.setLastName(registrationDto.getLastName());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        try {
            user.setImage(Base64.getEncoder().encodeToString(registrationDto.getImage().getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //user.setImage(user.getImage());
        userRepository.save(user);
        return "redirect:/adminDetails";
    }
}
