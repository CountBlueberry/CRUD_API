package com.blackout.demo.repository;

import com.blackout.demo.entety.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
