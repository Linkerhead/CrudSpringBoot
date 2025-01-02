package com.example.CrudSpringBoot.Repository;

import com.example.CrudSpringBoot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
