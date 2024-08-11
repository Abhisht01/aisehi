package com.example.demo.dto;

// src/main/java/com/yourcompany/dto/UserDTO.java

public class UserDTO {
    private Long userId;
    private String email;
    private String role;

    // Constructors, getters, and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

