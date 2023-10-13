package com.client.project.SpringCrudProject.Services.impl;

import com.client.project.SpringCrudProject.Entity.User;
import com.client.project.SpringCrudProject.Exceptions.ResourceNotFoundException;
import com.client.project.SpringCrudProject.Services.UserServices;
import com.client.project.SpringCrudProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server !! : "+userId));
    }

    @Override
    public User updateUser(String userId) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }
}
