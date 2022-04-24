package school.schoolproject.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import school.schoolproject.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
