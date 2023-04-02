package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author udarasan
 * @TimeStamp 2023-03-27 14:46
 * @ProjectDetails demo
 */
@RestController
@RequestMapping("api/v1/user")
@Transactional
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/save")
    public User saveUser(@RequestBody UserDTO userDTO){
        return  userRepo.save(modelMapper.map(userDTO, User.class));
    }
    @GetMapping("/getAllUsers")
    public List<User>saveUser(){
        return  userRepo.findAll();
    }
    @DeleteMapping("/{id}")
    public void saveUser(@PathVariable Long id){
        userRepo.deleteById(id);
    }
}
