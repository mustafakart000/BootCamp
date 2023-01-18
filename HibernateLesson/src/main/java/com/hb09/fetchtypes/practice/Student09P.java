package com.hb09.fetchtypes.practice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student09P {

    @Id
    private int id;
    @Column(name = "student_name",nullable = false)
    private String name;

    private int grade;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)//
    private List<Book09P> book09PList=new ArrayList<Book09P>();

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Book09P> getBook09PList() {
        return book09PList;
    }

    public void setBook09PList(List<Book09P> book09PList) {
        this.book09PList = book09PList;
    }

    @Override
    public String toString() {
        return "Student09P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", book09PList=" + book09PList +
                '}';
    }
}
