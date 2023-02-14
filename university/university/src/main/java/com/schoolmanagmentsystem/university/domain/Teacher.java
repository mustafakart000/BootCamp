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
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTeacher;

    private String firstname;

    private String lastNameT;

    @Email
    private String emailTeacher;


//    public Teacher(Manager manager) {
//
//        this.firstname = manager.getFirstname();
//        this.lastNameT = manager.getLastnameM();
//        this.emailTeacher = manager.getEmailManager();
//    }
}
