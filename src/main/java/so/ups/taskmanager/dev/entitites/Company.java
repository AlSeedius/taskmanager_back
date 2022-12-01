package so.ups.taskmanager.dev.entitites;

import javax.persistence.*;

@Table(name="companies")
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    public Company(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
    }

    public Integer getTaskID() {
        return id;
    }

    public void setTaskID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
