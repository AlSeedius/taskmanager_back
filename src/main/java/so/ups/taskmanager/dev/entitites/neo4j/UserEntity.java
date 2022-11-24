package so.ups.taskmanager.dev.entitites.neo4j;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Person")
public class UserEntity {

    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    @Property("email")
    private final String email;

    @Property("name")
    private final String name;

    @Property("password")
    private final String password;

    public UserEntity(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
