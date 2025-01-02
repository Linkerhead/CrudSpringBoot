package com.example.CrudSpringBoot.Service;

import com.example.CrudSpringBoot.DAO.UserDao;
import com.example.CrudSpringBoot.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional
    @Override
    public void save(User user) {
        userDao.saveUser(user);

    }


    @Override
    public User findById(Long id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.deleteUser(id);
    }


    @Override
    public List<User> findAll() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }
}


