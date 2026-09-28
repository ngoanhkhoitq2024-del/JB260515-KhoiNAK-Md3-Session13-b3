package re.edu.md3ss13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.md3ss13.entity.User;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
