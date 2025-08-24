package com.melisima.eventek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melisima.eventek.models.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{

}
