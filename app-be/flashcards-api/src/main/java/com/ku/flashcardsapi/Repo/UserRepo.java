package com.ku.flashcardsapi.Repo;

import com.ku.flashcardsapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}