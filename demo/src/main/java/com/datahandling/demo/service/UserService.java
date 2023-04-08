package com.datahandling.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datahandling.demo.dto.UserDTO;
import com.datahandling.demo.entity.User;
import com.datahandling.demo.repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private ModelMapper modelMapper;
    
    
    public UserDTO postUser(UserDTO userDTO){
       userRepo.save(modelMapper.map(userDTO, User.class));
       return userDTO;

    }
}
