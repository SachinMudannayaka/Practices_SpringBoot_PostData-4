package com.datahandling.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datahandling.demo.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
