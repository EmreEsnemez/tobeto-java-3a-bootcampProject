package com.tobeto.java3a.bootcampproject.dataaccess;

import com.tobeto.java3a.bootcampproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
