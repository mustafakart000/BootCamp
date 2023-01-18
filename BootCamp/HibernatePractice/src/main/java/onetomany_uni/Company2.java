package onetomany_uni;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Company2 {


    @OneToMany
    @JoinColumn(name = "company_id")//Join column kullanmazsak Join table üretilir. Dev table bir fk oluşturur.
    //Join column kullanmazsak join table üretilir.
    private Set<Developer05> devList= new HashSet<>();


    public Company2() {
    }


    public Company2(Long id, String companyname) {
        this.id = id;
        this.companyname = companyname;
    }

    @Id
    private Long id;

    @Column(unique = true)
    private String companyname;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Developer05> getDevList() {
        return devList;
    }

    public void setDevList(Set<Developer05> devList) {
        this.devList = devList;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
