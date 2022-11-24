package so.ups.taskmanager.dev.DAO.neo4j.Relationships;

import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;
import so.ups.taskmanager.dev.entitites.neo4j.CompanyEntity;

import java.util.List;
@RelationshipProperties
public class Projects {

        @RelationshipId
        private Long id;

        private final List<String> projects;

        @TargetNode
        private final CompanyEntity company;

        public Projects(CompanyEntity company, List<String> projects) {
            this.company = company;
            this.projects = projects;
        }

        public List<String> getRoles() {
            return projects;
        }
}
