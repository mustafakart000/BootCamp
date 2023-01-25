package com.tpe.SpringBoot_queryAndUpdate.domain;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NotBlank(message = "First Name can not be space")
    @NotNull(message = "First Name can not be null")
    @Size(min =2, max =25, message="First name '${ValidatedValue}' must be between {min} and {max} long")
    @Column(nullable = false, length =25)
    private String name;

    @NotBlank(message = "Last Name can not be space")
    @NotNull(message = "Last Name can not be null")
    @Column(nullable =false, length =25)
    private String lastName;


    private Integer Grade;

    @Column(nullable = false, length =50, unique=true)
    @Email
    private String email; //xxx@yyyy.com

    private String phoneNumber;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createDate= LocalDateTime.now();


}
