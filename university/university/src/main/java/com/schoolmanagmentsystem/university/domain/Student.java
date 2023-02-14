package com.schoolmanagmentsystem.university.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String firstname;

    private String lastNameS;
    @Email
    private String emailStudent;

//    public Student(Manager manager) {
//        this.firstname = manager.getFirstname();
//        this.lastNameS =manager.getLastnameM();
//        this.emailStudent = manager.getEmailManager();
//    }

}
