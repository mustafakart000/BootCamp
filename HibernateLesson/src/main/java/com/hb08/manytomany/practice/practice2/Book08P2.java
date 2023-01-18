package com.hb08.manytomany.practice.practice2;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book08P2 {
    @Id

    private int id;

    private String name;

    @ManyToMany
    @JoinTable(//3. tabloyu oluşturur
            name = "student_book_08P2",//tablonun ismi
            //tablonun headerlerin ismi
            joinColumns = {@JoinColumn(name = "std_id")},inverseJoinColumns = {@JoinColumn(name = "book_id")}
            //inverse karşı kolon
    )
    private List<Student08P2> student08P2List= new ArrayList<>();

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

    public List<Student08P2> getStudent08P2List() {
        return student08P2List;
    }

    public void setStudent08P2List(List<Student08P2> student08P2List) {
        this.student08P2List = student08P2List;
    }

    @Override
    public String toString() {
        return "Book08P2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
