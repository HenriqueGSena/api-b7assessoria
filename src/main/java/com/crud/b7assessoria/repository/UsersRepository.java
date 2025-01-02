package com.crud.b7assessoria.repository;

import com.crud.b7assessoria.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {
    UserDetails findByName(String name);
    String name(String name);
}
