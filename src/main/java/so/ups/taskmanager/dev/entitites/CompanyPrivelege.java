package so.ups.taskmanager.dev.entitites;

import javax.persistence.*;

@Table(name="company_privileges")
@Entity
public class CompanyPrivelege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "companyid")
    private Integer companyid;

    @Column(name = "role")
    private Integer role;

    public CompanyPrivelege(Integer id, Integer userid, Integer companyid, Integer role) {
        this.id = id;
        this.userid = userid;
        this.companyid = companyid;
        this.role = role;
    }

    public CompanyPrivelege() {
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

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
