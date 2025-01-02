package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.model.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public User findById(Long id);
    public void delete(Long id);
    public List<User> findAll();
    public void update(User user);
}
