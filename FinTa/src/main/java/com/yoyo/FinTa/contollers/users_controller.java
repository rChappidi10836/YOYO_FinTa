package com.yoyo.FinTa.contollers;

import com.yoyo.FinTa.entity.users;
import com.yoyo.FinTa.repo.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class users_controller {

    @Autowired
    usersRepository userRepo;

    @GetMapping("/hi")
    public String getcall(){
        return "hey darling I will always respond to you";
    }

    @GetMapping("/get-users")
    public Iterable<users> getusers(){
        return userRepo.findAll();
    }

    @PostMapping("/register-user")
    public void adduser(@RequestBody users u){
        userRepo.save(u);
    }

//    @GetMapping('/finduser')
//    public users getUserbyId(@RequestParam int Id){
//        return userRepo.findById(Id);
//    }

}
