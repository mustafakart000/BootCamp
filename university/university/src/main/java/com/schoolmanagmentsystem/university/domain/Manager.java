package com.schoolmanagmentsystem.university.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
@Getter
@Setter
@Entity
public class Manager{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idManager;

    @Size(min = 2, max =25)
    private String firstname;

    @Size(min = 2, max =25)
    private String lastnameM;

    @Email
    private String emailManager;






}
