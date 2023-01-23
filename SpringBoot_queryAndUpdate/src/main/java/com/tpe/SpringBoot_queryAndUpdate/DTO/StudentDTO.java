package com.tpe.SpringBoot_queryAndUpdate.DTO;

import com.tpe.SpringBoot_queryAndUpdate.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long id;


    @NotNull(message = "first name can not be null")
    @NotBlank(message="first name can not be space")
    @Size(min = 2, max =25, message="First name '{ValidateValue}' must be between {min} and {max} long")
    private String firstName;

    private String lastName;

    private Integer grade;


    @Email(message = "Provide valid email")
    private String email; //xxx@yyyy.com

    private String phoneNumber;

    private LocalDateTime createDate= LocalDateTime.now();

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.firstName = student.getName();
        this.lastName = student.getLastName();
        this.grade = student.getGrade();
        this.email = student.getEmail();
        this.phoneNumber = student.getPhoneNumber();
        this.createDate = student.getCreateDate();
    }

}
