package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List; 

import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllMentors() {
        return userRepository.findByRole_Role("mentor").stream().map(UserMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO addMentor(UserDTO mentor) {
        mentor.setRole("mentor");
        User user = UserMapper.toEntity(mentor);
        user = userRepository.save(user);
        return UserMapper.toDTO(user);
    }
}
