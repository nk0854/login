package com.flavourbook.FlavourBook.repository;

import com.flavourbook.FlavourBook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
