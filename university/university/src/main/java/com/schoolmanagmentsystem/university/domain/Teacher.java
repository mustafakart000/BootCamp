package com.schoolmanagmentsystem.university.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idd;
    @Size(min=2, max=25)
    private String firstname;

    @Size(min=2, max=25)
    private String lastName;

    @Email(message="please enter email to comply with the rules")
    private String emailTeacher;

}
