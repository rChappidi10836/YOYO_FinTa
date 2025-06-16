package com.yoyo.FinTa.contollers;

import com.yoyo.FinTa.entity.users;
import com.yoyo.FinTa.repo.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DB_controller {

    @Autowired
    usersRepository userRepo;

    @GetMapping("/hi")
    public String getcall(){
        return "hey darling I will always respond to you";
    }

    @GetMapping("/USERS")
    public Iterable<users> getusers(){
        return userRepo.findAll();
    }



}
