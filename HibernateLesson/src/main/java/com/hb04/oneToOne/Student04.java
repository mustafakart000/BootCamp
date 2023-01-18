package com.hb04.oneToOne;

import javax.persistence.*;

@Entity
public class Student04 {

    @Id
    private int Id; // private long id;

    @Column(name = "std_name")

    private String name;

    private int grade;

    @OneToOne(mappedBy = "student")//sadece Diary tablosunda ilişki için yeni bir kolan oluşmasını sağlıyor
    private Diary04 diary;



    //Getter--Setter


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public Diary04 getDiary() {
        return diary;
    }

    public void setDiary(Diary04 diary) {
        this.diary = diary;
    }
    //toString


    @Override
    public String toString() {
        return "Student04{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
