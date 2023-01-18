package com.hb08.manytomany.practice.practice2;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student08P2 {


    @Id
    private int id;

    @Column(name = "student_name", nullable = false)
    private String name;

    private int grade;

    @ManyToMany
    private List<Book08P2> book08P2List = new ArrayList<>();




    //Getter-Setter


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

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

    public List<Book08P2> getBook08P2List() {
        return book08P2List;
    }

    public void setBook08P2List(List<Book08P2> book08P2List) {
        this.book08P2List = book08P2List;
    }

    //ToString


    @Override
    public String toString() {
        return "Student08P2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book08P2List=" + book08P2List +
                '}';
    }

}
