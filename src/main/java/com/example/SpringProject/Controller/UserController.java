package com.example.SpringProject.Controller;

import com.example.SpringProject.DTO.UserDTO;
import com.example.SpringProject.Repo.UserRepo;
import com.example.SpringProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getusers")
    public List<UserDTO> getUsers(){
        return userService.getAllusers();
    }

    @PostMapping("/addUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }


    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
         return userService.updateUser(userDTO);
    }

     @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
     }


     @GetMapping("/user/{userId}")
    public UserDTO getUserByid(@PathVariable Integer userId){
          return userService.getUserById(userId);
     }

}
