package com.schoolmanagmentsystem.university.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Manager {


    private Long idTeacher;

    private String firstname;


    private String lastNameT;


    private String emailTeacher;


    public Teacher(Manager manager) {
        this.idTeacher = manager.getIdManager();
        this.firstname = manager.getFirstname();
        this.lastNameT = manager.getLastnameM();
        this.emailTeacher = manager.getEmailManager();
    }
}
