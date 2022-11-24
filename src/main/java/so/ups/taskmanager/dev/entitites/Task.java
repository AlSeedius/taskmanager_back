package so.ups.taskmanager.dev.entitites;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Table(name="taskbase")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskid")
    private Integer taskID;
    @Column(name = "text")
    private String text;
    @Column(name = "date_start")
    private java.sql.Date dateStarted;

    @Column(name = "userid")
    private Integer userID;

    public Task() {
    }

    public Task(Integer taskID, String text, java.sql.Date dateStarted, Integer userID) {
        this.taskID = taskID;
        this.text = text;
        this.dateStarted = dateStarted;
        this.userID = userID;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(LocalDateTime dateStarted) {
        this.dateStarted = java.sql.Date.valueOf(LocalDate.now());
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
