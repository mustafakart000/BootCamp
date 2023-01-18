package com.hb03.uni_onetoone.practice;

import javax.persistence.*;

@Entity
public class DiaryPractice {
    @Id
    private int id;

    @Column(name="name2")
    private String Country;
    private String name;

    private Integer age;

    private Character gander;

    @OneToOne
    @JoinColumn(name="tchr_id")
    private TeacherPractice01 teacher;

    public TeacherPractice01 getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherPractice01 teacher) {
        this.teacher = teacher;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Character getGander() {
        return gander;
    }

    public void setGander(Character gander) {
        this.gander = gander;
    }

    @Override
    public String toString() {
        return "DiaryPractice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Country='" + Country + '\'' +
                ", gander=" + gander +
                '}';
    }
}
