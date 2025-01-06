package com.crud.b7assessoria.repository;

import com.crud.b7assessoria.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {
    Optional<Users> findByName(String name);
    String name(String name);
}
