package so.ups.taskmanager.dev.entitites.neo4j;

import org.springframework.data.neo4j.core.schema.*;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Project")
public class ProjectEntity {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    @Property("name")
    private final String name;

    public ProjectEntity(String name) {
        this.name = name;
    }
}
