package com.hb08.manytomany.practice;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student08P {
    @Id
    private int id;

    @Column(name="student_name", nullable =false)
    private String name;

    private int grade;
    @ManyToMany
    @JoinTable(name = "student08P_book08P",
    joinColumns = {@JoinColumn(name = "std_id")}, //oluşacak 3. table daki 1. column adı joinColumns oluştuğu class'ın column'udur
    inverseJoinColumns = {@JoinColumn(name = "book_id")})//oluşacak 3. table daki 2. column adı  inverseJoinColumns karşıdaki classdır.
    private List<Book08P> book08PList = new ArrayList<>();
    //Getter_Setter
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

    public List<Book08P> getBook08PList() {
        return book08PList;
    }

    public void setBook08PList(List<Book08P> book08PList) {
        this.book08PList = book08PList;
    }

    //ToString


    @Override
    public String toString() {
        return "Student08P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", book08PList=" + book08PList +
                '}';
    }
}
