package so.ups.taskmanager.dev.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.Project;
@Repository
public interface ProjectsRepository extends CrudRepository <Project, Integer> {

}
