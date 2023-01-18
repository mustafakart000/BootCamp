package com.hb05.manytoone.practice2;

import com.hb05.manytoone.practice.University;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Student05P {
    @Id
    private int id;

    @Column(name="student_name",nullable = false)
    private String name;

    private int grade;

    private LocalDateTime createOn;//Create edilme Tarihi...

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University05P university;



    public University05P getUniversity() {
        return university;
    }

    public void setUniversity(University05P university) {
        this.university = university;
    }
    @PrePersist//database kalıcı olarak kayıt oluşturur.
    public void prePersist(){
        createOn=LocalDateTime.now();
    }
    //Getter-setter


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

    public LocalDateTime getCreateOn() {
        return createOn;
    }

//    public void setCreateOn(LocalDateTime createOn) {
//        this.createOn = createOn;
//    }


    @Override
    public String toString() {
        return "Student05P{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", createOn=" + createOn +
                ", university=" + university +
                '}';
    }
}
