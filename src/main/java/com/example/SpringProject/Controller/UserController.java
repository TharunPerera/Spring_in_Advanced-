package com.example.SpringProject.Controller;

import com.example.SpringProject.DTO.UserDTO;
import com.example.SpringProject.Repo.UserRepo;
import com.example.SpringProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getuser")
    public List<UserDTO> getUser(){
        return userService.getAllusers();
    }



}
