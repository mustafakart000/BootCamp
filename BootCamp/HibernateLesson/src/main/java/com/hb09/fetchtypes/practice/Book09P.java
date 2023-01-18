package com.hb09.fetchtypes.practice;

import javax.persistence.*;

@Entity
public class Book09P {

    @Id
    private int id;


    private String name;
    @ManyToOne
    @JoinColumn
    private Student09P student;

    //getter--Setter


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

    public Student09P getStudent() {
        return student;
    }

    public void setStudent(Student09P student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Book09P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
