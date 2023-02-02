package com.schoolmanagmentsystem.university.domain;


import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student  extends Manager{


    private Long idStudent;

    private String firstname;

    private String lastNameS;

    private String emailStudent;

    public Student(Manager manager) {
        this.idStudent = manager.getIdManager();
        this.firstname = manager.getFirstname();
        this.lastNameS =manager.getLastnameM();
        this.emailStudent = manager.getEmailManager();
    }

}
