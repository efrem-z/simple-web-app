package ru.ez.simpleWebApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ez.simpleWebApp.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
