package com.example.userregistration.service;

import com.example.userregistration.model.User;
import com.example.userregistration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(User user) {
        // шифруємо пароль
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // ставимо роль автоматично
        user.setRole("USER");
        userRepository.save(user);
    }
}
