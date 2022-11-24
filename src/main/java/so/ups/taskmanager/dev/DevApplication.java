package so.ups.taskmanager.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
public class DevApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
    }

}
