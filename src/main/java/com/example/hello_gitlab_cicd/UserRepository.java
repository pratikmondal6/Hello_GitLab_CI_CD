package com.example.hello_gitlab_cicd;


import org.springframework.data.jpa.repository.JpaRepository;

// Use extends to inherit from JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

    // No need to override flush() method, it's already defined in JpaRepository
}
