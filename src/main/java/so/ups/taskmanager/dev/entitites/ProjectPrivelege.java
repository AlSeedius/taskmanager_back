package so.ups.taskmanager.dev.entitites;

import javax.persistence.*;

@Table(name="project_privileges")
@Entity
public class ProjectPrivelege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "projectid")
    private Integer projectid;

    @Column(name = "role")
    private Integer role;

    public ProjectPrivelege(Integer id, Integer userid, Integer projectid, Integer role) {
        this.id = id;
        this.userid = userid;
        this.projectid = projectid;
        this.role = role;
    }

    public ProjectPrivelege() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
