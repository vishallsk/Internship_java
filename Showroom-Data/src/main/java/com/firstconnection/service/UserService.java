package com.firstconnection.service;

import com.firstconnection.model.User;
import com.firstconnection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveAllUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
