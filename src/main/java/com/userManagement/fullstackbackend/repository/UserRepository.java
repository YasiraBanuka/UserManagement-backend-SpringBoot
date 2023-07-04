package com.userManagement.fullstackbackend.repository;

import com.userManagement.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
