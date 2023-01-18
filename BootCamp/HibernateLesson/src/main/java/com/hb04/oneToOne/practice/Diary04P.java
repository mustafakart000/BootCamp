package com.hb04.oneToOne.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Diary04P {
    @Id
    private int id;
    private String name;
    @OneToOne
    private Student04P student;

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

    public Student04P getStudent04() {
        return student;
    }

    public void setStudent04(Student04P student04P) {
        this.student = student04P;
    }

    @Override
    public String toString() {
        return "Diary04{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student04=" + student +
                '}';
    }
}
