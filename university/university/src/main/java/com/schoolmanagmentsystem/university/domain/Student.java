package com.schoolmanagmentsystem.university.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id_student;
    @Size(min = 2, max =25)
    @NotBlank(message = "Name can nut be space")
    @NotNull(message = "Name can not be null")
    private String firstNameStudent;

    @Size(min = 2, max =25)
    @NotBlank(message = "Name can nut be space")
    @NotNull(message = "Name can not be null")
    private String lastNameStudent;

    private int age_student;

    private int getGrade;
    @Email
    @Size(min = 1, max = 55)
    private String emailStudent;

}
