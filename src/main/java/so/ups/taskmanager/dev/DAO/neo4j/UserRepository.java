package so.ups.taskmanager.dev.DAO.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.neo4j.UserEntity;
@Repository
public interface UserRepository extends Neo4jRepository<UserEntity, String> {
    boolean existsUserEntityByEmail(String email);
}