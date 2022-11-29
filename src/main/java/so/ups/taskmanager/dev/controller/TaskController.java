package so.ups.taskmanager.dev.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import so.ups.taskmanager.dev.DAO.TasksRepository;
import so.ups.taskmanager.dev.DAO.UserRepository;
import so.ups.taskmanager.dev.entitites.Task;
import so.ups.taskmanager.dev.reponses.Text;
import so.ups.taskmanager.dev.security.jwt.JwtUtils;
import so.ups.taskmanager.dev.service.TaskService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("tasks/")
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    TasksRepository tasksRepository;
    @Autowired
    TaskService taskService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("add")
    @CrossOrigin(origins = "*")
    public Task addTask(@RequestBody Text text, @RequestHeader (name="Authorization") String token) {
        Task t = new Task();
        int id = userRepository.findByUsername(jwtUtils.getUserNameFromJwtToken(token.replace("Bearer ", ""))).get().getId();
        t.setUserID(id);
        t.setText(text.getText());
        t.setDateStarted(LocalDateTime.now());
        tasksRepository.save(t);
        return t;
    }

    @GetMapping("get")
    @CrossOrigin(origins = "*")
    public List<Task> taskList(@RequestHeader (name="Authorization") String token){
        int id = userRepository.findByUsername(jwtUtils.getUserNameFromJwtToken(token.replace("Bearer ", ""))).get().getId();
        return tasksRepository.findAllByUserID(id);
    }

}