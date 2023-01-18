package com.hb04.oneToOne.practice;

import javax.persistence.*;

@Entity
public class Student04P {
    @Id
    private int id;
    @Column(name= "std_name")
    private String name;
    private int grade;

    @OneToOne(mappedBy = "student")
    private Diary04P diary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name)    {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Diary04P getDiary() {
        return diary;
    }

    public void setDiary(Diary04P diary) {
        this.diary = diary;
    }

    @Override
    public String toString() {
        return "Student04P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
