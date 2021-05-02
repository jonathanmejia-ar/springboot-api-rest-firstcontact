package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) this.userRepo.findAll();
    };

    public UserModel createUser(UserModel user) {
        return this.userRepo.save(user);
    };

    public Optional<UserModel> getById(Long id) {
        return this.userRepo.findById(id);
    };

    public ArrayList<UserModel> getByPriority(Integer priority) {
        return this.userRepo.findByPriority(priority);
    };

    public boolean deleteUser(Long id) {
        try {
            userRepo.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    };
};
