package com.tpe.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

//Entity classlarımızı domain oluştrucağımız domaindir.
@Entity
@Table(name = "t_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "isim giriniz")
    private String firstName;

    @NotEmpty(message = "soyisim giriniz")
    private String lastName;
    @NotNull(message = "lütfen puan bilgisini giriniz.")
    private Integer grade;
    private LocalDateTime createDate= LocalDateTime.now();

    public Long getId() {
        return id;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }



}
