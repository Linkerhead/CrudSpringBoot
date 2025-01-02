package com.example.CrudSpringBoot.dao;

import com.example.CrudSpringBoot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAO implements UserDao {

    @PersistenceContext
    private final EntityManager em;

    @Autowired
    public DAO(EntityManager em) {
        this.em = em;
    }


    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(em.find(User.class, id));

    }

    @Override
    public void updateUser(User user) {
        em.merge(user);

    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
