package com.example.CrudSpringBoot.Service;

import com.example.CrudSpringBoot.Model.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public User findById(Long id);
    public void delete(Long id);
    public List<User> findAll();
    public void update(User user);
}
