package com.tpe.springbootintopractice2.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;


    @NotNull(message = "first name can not be null")
    @NotBlank(message = "last name can not be empty")
    @Size(min = 2, max =25, message ="FirstName '{validatedValue}' must be between {min} and {max} long")
    @Column(nullable = false, length =25)
    private String name;

    private String lastName;

    @Column(nullable = false, length =50, unique = true)
    @Email(message = "Provide valid email address")
    private  String email; //merhaba nasılsın email olmaz bu yüzden ---xxx@yyy.com---

    private String phoneNumber;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createDate = LocalDateTime.now();




}
