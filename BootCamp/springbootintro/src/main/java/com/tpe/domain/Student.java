package com.tpe.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NotNull(message = "first name can not be null")
    @NotBlank(message = "first name can not be white space")
    @Size(min =2, max =25, message = "First name '{validatedValue}' must be between {min} and {max} long")
    @Column(nullable = false, length=25)
    /*final*/ private String name;

    @NotNull(message = "last name can not be null")
    @NotBlank(message = "last name can not be white space")
    @Column(nullable = false, length=25)
    /*final*/ private String lastname;

    private Integer grade;

    @Column(nullable = false, length=50, unique = true)
    @Email(message = "Provide valid email address")
    private String email;//merhaba nasılsın email olmaz bu yüzden --xxx@yyy.com---


    /*final*/ private String phoneNumber;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createDate= LocalDateTime.now();



    //Getter-Setter @getter - @setter annotation'ı ekledık

    //Constructor


}
