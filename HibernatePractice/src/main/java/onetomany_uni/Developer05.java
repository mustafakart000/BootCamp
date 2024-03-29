package onetomany_uni;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Developer05 {
    @Id
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(unique = true)
    private String email;

    private String branch;

    //
    //

    @OneToOne
    private Company2 company2;


    public Developer05() {
    }

    public Developer05(Long id, String name, String email, String branch, Company2 company2) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.company2 = company2;
    }

    public Company2 getCompany() {
        return company2;
    }

    public void setCompany(Company2 company2) {
        this.company2 = company2;
    }

    public Developer05(Long id, String name, String email, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}


