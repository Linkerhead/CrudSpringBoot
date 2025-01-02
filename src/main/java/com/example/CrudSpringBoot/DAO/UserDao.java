package com.example.CrudSpringBoot.DAO;

import com.example.CrudSpringBoot.Model.User;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
    public List<User> getAllUsers();


}
