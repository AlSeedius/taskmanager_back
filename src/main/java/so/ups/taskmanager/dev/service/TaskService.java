package so.ups.taskmanager.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.ups.taskmanager.dev.DAO.TasksRepository;
import so.ups.taskmanager.dev.entitites.Task;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class TaskService {
    @Autowired
    private TasksRepository taskRepository;

    public void AddTask(String text){
        Task t = new Task();
        t.setText(text);
        t.setDateStarted(LocalDateTime.now());
        taskRepository.save(t);
    }
}
