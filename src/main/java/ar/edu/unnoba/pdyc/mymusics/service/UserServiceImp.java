package ar.edu.unnoba.pdyc.mymusics.service;

import ar.edu.unnoba.pdyc.mymusics.model.User;
import ar.edu.unnoba.pdyc.mymusics.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User find(Long id) {
        return userRepository.findById(id).get();
    }

    
}
