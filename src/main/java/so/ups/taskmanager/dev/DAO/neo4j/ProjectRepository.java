package so.ups.taskmanager.dev.DAO.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.neo4j.ProjectEntity;
@Repository
public interface ProjectRepository extends Neo4jRepository<ProjectEntity, String> {
    ProjectEntity findProjectEntityByName(String name);
}
