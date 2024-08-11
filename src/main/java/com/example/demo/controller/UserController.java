package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Endpoint to get a list of mentors
    @GetMapping("/getmentors")
    public List<UserDTO> getMentors() {
        return userService.getAllMentors();
    }

    // Endpoint to add a mentor
    @PostMapping("/addmentors")
    public UserDTO addMentor(@RequestBody UserDTO mentor) {
        return userService.addMentor(mentor);
    }
}
