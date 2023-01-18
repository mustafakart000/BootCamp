package com.hb08.manytomany.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Book08P {

    @Id
    private int id;

    private String name;
    @ManyToMany(mappedBy = "book08PList")
    private List<Student08P> student08P;


    //Getter-Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student08P> getStudent08P() {
        return student08P;
    }

    public void setStudent08P(List<Student08P> student08P) {
        this.student08P = student08P;
    }
    //ToString
    @Override
    public String toString() {
        return "Book08P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
