package so.ups.taskmanager.dev.entitites.neo4j;

import org.springframework.data.neo4j.core.schema.*;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.ArrayList;
import java.util.List;

@Node("Company")
public class CompanyEntity {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    @Property("name")
    private final String name;

    @Relationship(type = "CREATED", direction = Relationship.Direction.OUTGOING)
    private List<ProjectEntity> projects = new ArrayList<>();

    public CompanyEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void ConnectProject(ProjectEntity pe){
        projects.add(pe);
    }
}
