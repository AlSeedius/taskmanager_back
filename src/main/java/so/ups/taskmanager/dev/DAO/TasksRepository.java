package so.ups.taskmanager.dev.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.Task;

import java.util.List;

@Repository
public interface TasksRepository extends CrudRepository<Task, Integer> {
    Task findByTaskID(int id);
    List<Task> findAllByUserID(int id);
}