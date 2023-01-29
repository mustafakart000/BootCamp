package com.schoolmanagmentsystem.university.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

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
public class Teacher {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Long id_teacher;
        @Size(min = 2, max =25)
        @NotBlank(message = "Name can nut be space")
        @NotNull(message = "Name can not be null")
        private String firstNameTeacher;

        @Size(min = 2, max =25)
        @NotBlank(message = "Name can nut be space")
        @NotNull(message = "Name can not be null")
        private String lastNameTeacher;

        @Size(min = 1, max =4)
        private int age;

        @Size(min = 1, max =4)
//        @NumberFormat(style = NumberFormat.Style.DEFAULT)
        private int giveGrade;

        @Email
        private String EmailTeacher;


}
