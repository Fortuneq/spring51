package com.example.java51spring2.Repository;

import com.example.java51spring2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
