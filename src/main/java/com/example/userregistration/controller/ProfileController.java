package com.example.userregistration.controller;

import com.example.userregistration.model.Profile;
import com.example.userregistration.model.User;
import com.example.userregistration.repository.ProfileRepository;
import com.example.userregistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private UserRepository userRepository;

    // Перенаправлення з /profile на /profile/new
    @GetMapping
    public String redirectToNewProfile() {
        return "redirect:/profile/new";
    }

    // Показати форму створення профілю
    @GetMapping("/new")
    public String newProfileForm() {
        return "profile_form";  // Назва твого шаблону форми (profile_form.jte або .html)
    }

    // Обробка POST-запиту на створення профілю
    @PostMapping("/create")
    public String createProfile(@RequestParam String fullName,
                                @RequestParam int age,
                                Principal principal) {

        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Profile profile = new Profile();
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setUser(user);

        profileRepository.save(profile);

        return "redirect:/";  // Після створення профілю редірект на головну сторінку
    }
}
