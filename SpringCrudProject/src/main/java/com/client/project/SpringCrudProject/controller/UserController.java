package com.client.project.SpringCrudProject.controller;

import com.client.project.SpringCrudProject.Entity.User;
import com.client.project.SpringCrudProject.Response.ApiResponse;
import com.client.project.SpringCrudProject.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    //create user

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userServices.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    //get all user

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUsers = userServices.getAllUser();
        return ResponseEntity.ok(allUsers);
    }

    //get user by Id

    @GetMapping("{userId}")
    public ResponseEntity<User> getUserById(@PathVariable  String userId){

        User userWithId = userServices.getUserById(userId);

        return ResponseEntity.ok(userWithId);
    }

    //update user by Id

    @PutMapping ("{userId}")
    public ResponseEntity<User> updateUserById(@RequestBody User user, @PathVariable String userId){
       User updatedUser = userServices.updateUser(userId);
       return ResponseEntity.ok(updatedUser);
    }

    //delete user by Id

    @DeleteMapping("{userId}")
    public ResponseEntity<ApiResponse> deleteUserById(@PathVariable String userId){
        userServices.deleteUser(userId);
        return new ResponseEntity<>(new ApiResponse("User deleted SucessFully", true), HttpStatus.OK);
    }

}
