package com.client.project.SpringCrudProject.Services;

import com.client.project.SpringCrudProject.Entity.User;

import java.util.List;

public interface UserServices {

    //user operations

    //create
    User saveUser(User user);

    //get all user

    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);

    //Updtae User with given Id
    User updateUser(String userId);

    //delete user with given Id

    void deleteUser(String userId);
}
