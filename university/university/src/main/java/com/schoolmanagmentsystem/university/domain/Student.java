package com.schoolmanagmentsystem.university.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity



public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Size(min=2, max=25)
    private String firstname;

    @Size(min=2, max=25)
    private String lastName;

    private String emailStudent;



}
