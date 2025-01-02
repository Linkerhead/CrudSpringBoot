package com.example.CrudSpringBoot.dao;

import com.example.CrudSpringBoot.model.User;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
    public List<User> getAllUsers();


}
