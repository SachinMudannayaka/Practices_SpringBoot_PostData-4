package com.datahandling.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datahandling.demo.dto.UserDTO;
import com.datahandling.demo.service.UserService;
@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Get User";
    }

    @PostMapping("/postUser")
    public UserDTO postUser(@RequestBody UserDTO userDTO){
        return userService.postUser(userDTO);

    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "Update User";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
    return "Delete User";
    }
}
