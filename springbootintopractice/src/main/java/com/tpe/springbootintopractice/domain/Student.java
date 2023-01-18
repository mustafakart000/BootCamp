package com.tpe.springbootintopractice.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;


    @NotNull(message = "First name can not be null")
    @NotBlank(message = "First name can not be blank")
    @Size(min = 0, max =50, message="First  name '{ValidateValue}' must be between {min} and {max} long")
    @Column(nullable = false, length =25)
    private String name;

    @NotNull(message = "Last name can not be null")
    @NotBlank(message = "Last name can not be blank")
    @Column(nullable = false, length =25)
    private String lastName;

    private Integer grade;

    @Column(nullable = false, length =50,unique = true)
    @Email(message = "Provide valid email address")
    private String email;//merhaba nasılsın email olmaz bu yüzden ---xxx@yyy.com--- @Email annotation'nı kullandık

    private String phoneNumber;

    LocalDateTime formattedDate = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Setter(AccessLevel.NONE)
    private  String createDate = formattedDate.format(myFormatObj);

    //Getter-Setter annotaion'nı ekledik ve getter setter'a gerek kalmadı :)


}
