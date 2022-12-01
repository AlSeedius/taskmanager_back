package so.ups.taskmanager.dev.entitites;

import javax.persistence.*;

@Table(name="projects")
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "companyid")
    private Integer companyId;

    public Project(Integer id, String name, Integer companyId) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
    }

    public Project() {
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
