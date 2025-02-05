package com.example.SpringProject.Service;

import com.example.SpringProject.DTO.UserDTO;
import com.example.SpringProject.Model.User;
import com.example.SpringProject.Repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userrepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllusers(){
        List<User> userList = userrepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }


    public UserDTO saveUser(UserDTO userDTO) {
        userrepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDTO updateUser(UserDTO userDTO){
        userrepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public String deleteUser(Integer userId){
//        userrepo.delete(modelMapper.map(userDTO, User.class));
        userrepo.deleteById(userId);
        return "user deleted";
    }

    public UserDTO getUserById(Integer userId){
        User user = userrepo.getUserById(userId);
        return modelMapper.map(user, UserDTO.class);
    }
}
