package com.exceptionhandlingexample.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptionhandlingexample.api.dto.UserRequest;
import com.exceptionhandlingexample.api.entity.User;
import com.exceptionhandlingexample.api.exception.UserNotFoundException;
import com.exceptionhandlingexample.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(UserRequest userRequest) {
        User user = new User();
        user.builder();
        return repository.save(user);
    }


    public List<User> getALlUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }
    }
}