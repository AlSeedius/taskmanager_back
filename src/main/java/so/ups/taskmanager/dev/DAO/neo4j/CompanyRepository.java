package so.ups.taskmanager.dev.DAO.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.neo4j.CompanyEntity;
@Repository
public interface CompanyRepository extends Neo4jRepository<CompanyEntity, String> {
    CompanyEntity findCompanyEntityByName(String name);
}
