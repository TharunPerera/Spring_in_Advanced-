package com.example.SpringProject.Repo;

import com.example.SpringProject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface UserRepo extends JpaRepository<User ,Integer> {

    @Query(value = "SELECT * FROM User WHERE id = ?1", nativeQuery = true)
    User getUserById(Integer userId);


}
