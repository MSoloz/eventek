package com.melisima.eventek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melisima.eventek.models.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    public User existsByUsername(String username);
 
}
