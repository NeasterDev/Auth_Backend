package com.blog.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long>{
    // creates SQL Query to find a user in the database
    // based on the username (usernames must be unique)
    AppUser findByUsername(String username);
}
