package so.ups.taskmanager.dev.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.User;

import java.util.Optional;

@Repository
public interface OldUserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
