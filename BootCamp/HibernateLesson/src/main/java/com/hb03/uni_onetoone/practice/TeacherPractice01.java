package com.hb03.uni_onetoone.practice;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TeacherPractice01 {
    @Id
    private int Tc;



    public int getTc() {
        return Tc;
    }
    public void setTc(int tc) {
        Tc = tc;
    }

    @Override
    public String toString() {
        return "TeacherPractice01{" +
                ", Tc=" + Tc +
                '}';
    }
}
