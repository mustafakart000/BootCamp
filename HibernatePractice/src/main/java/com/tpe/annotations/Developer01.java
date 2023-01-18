package com.tpe.annotations;


import javax.persistence.*;

@Entity
@Table(name="dev_01")
public class Developer01 {
    @Id//we have to add the @Id class known as primary key
    private int Id;

    @Column(name="dev_name",length = 50, nullable = false, unique = false)
    private String name;

    @Column(unique = true)
    private String email;

    //@Transient
    private String branch;
    //Constructor


    public Developer01() {
    }

    public Developer01(int id, String name, String email, String branch) {
        Id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
    }

    //Getter-Setter

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
