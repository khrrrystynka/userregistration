package com.example.userregistration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;

    // Геттер для id (не обов'язково, але корисно)
    public Long getId() {
        return id;
    }

    // Геттер і сеттер для username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер і сеттер для password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Геттер і сеттер для role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
