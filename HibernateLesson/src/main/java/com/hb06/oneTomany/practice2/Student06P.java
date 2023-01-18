package com.hb06.oneTomany.practice2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student06P {
    @Id
    private int id;

    @Column(name="student_name", nullable=false)
    private String name;
    private int grade;

    @OneToMany
    @JoinColumn
    private List<Book06P> bookList= new ArrayList<>();

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

    public List<Book06P> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book06P> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Student06P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
